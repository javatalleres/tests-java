package com.formacion.springboot.app.lotes.controller;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.springboot.app.lotes.dto.PagoDTO;
import com.formacion.springboot.app.lotes.models.entity.Lote;
import com.formacion.springboot.app.lotes.models.entity.Pago;
import com.formacion.springboot.app.lotes.service.ILoteService;
import com.formacion.springboot.app.lotes.service.IPagoService;

@RestController
@RequestMapping("/api/pagos")
public class PagosAppController {
	@Autowired
	private IPagoService pagoService;
	
	@Autowired
	private ILoteService loteService;
	
	@GetMapping("/listar/pagos")
	public ResponseEntity<List<Pago>> lisgtarPagos() throws Exception{
		List<Pago> list = pagoService.getAllPagos();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PostMapping("/registrar/pagos")
	public ResponseEntity<Pago> crearPago(@RequestBody PagoDTO pagoDTO) throws Exception{
		//System.out.println(pagoDTO);
		Lote lote = loteService.findById(pagoDTO.getCodLote());
		System.out.println(pagoDTO.getCodLote());
		Pago pago = pagoService
				.create(Pago.builder().fecIngreso(new java.util.Date()).valor(pagoDTO.getValor())
						.codConcepto(pagoDTO.getCodConcepto()).descripcion(pagoDTO.getDescripcion())
						.idEstado(pagoDTO.getIdEstado()).lote(lote).build());
		return new ResponseEntity<>(pago, HttpStatus.CREATED);
	}

}
