package com.formacion.springboot.app.lotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.springboot.app.lotes.dto.LoteDTO;
import com.formacion.springboot.app.lotes.dto.PagoDTO;
import com.formacion.springboot.app.lotes.models.entity.Cliente;
import com.formacion.springboot.app.lotes.models.entity.Lote;
import com.formacion.springboot.app.lotes.models.entity.Pago;
import com.formacion.springboot.app.lotes.service.IClienteService;
import com.formacion.springboot.app.lotes.service.ILoteService;
import com.formacion.springboot.app.lotes.service.IPagoService;

@RestController
@RequestMapping("/api/pagos")
public class PagosAppController {
	@Autowired
	private IPagoService pagoService;

	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private ILoteService loteService;

	
	@PostMapping(value = "/registrar/pago") 
	public ResponseEntity<Pago> registrarPago(@RequestBody PagoDTO pagoDto) {

		Lote lote = loteService.findLote(pagoDto.getCodLote());
		Pago temp = pagoService
				.create(Pago.builder()
						.codComprobante(pagoDto.getCodComprobante())
						.valor(pagoDto.getValor())
						.descripcion(pagoDto.getDescripcion())
						.lote(lote).build());
		return new ResponseEntity<>(temp, HttpStatus.CREATED);
	}

	@GetMapping(value = "/listar/pagos") 
	public ResponseEntity<List<Pago>> listarPagos() {
		List<Pago> pagos = pagoService.getAllPagos();
		return new ResponseEntity<>(pagos, HttpStatus.OK);
	}

	@GetMapping(value = "/buscar/pagos/{idPago}")
	public ResponseEntity<Pago> buscarPagos(@PathVariable ("idPago") Long idPago ) {
		Pago pago = pagoService.findPago(idPago);
		return new ResponseEntity<>(pago, HttpStatus.OK);
	}

	
}
