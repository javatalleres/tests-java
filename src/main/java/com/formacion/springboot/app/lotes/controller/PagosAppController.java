package com.formacion.springboot.app.lotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/api/lotes")

public class PagosAppController {
	
	@Autowired
	private ILoteService loteService;
	
	@Autowired
	private IPagoService pagoService;
	
	@PostMapping(value ="/registrar/pago")
	public ResponseEntity<Pago> registrarPago(@RequestBody PagoDTO pagoDTO){
		
		Lote lote = loteService.findLote(pagoDTO.getCodeLote());
		Pago pago = pagoService
				            .crearPago(Pago.builder().codConcepto(pagoDTO.getCodConsepto()).
				    		lote(lote).descripcion(pagoDTO.getDescripcion()).valor(pagoDTO.getPago()).build());
		return new ResponseEntity<>(pago, HttpStatus.CREATED);
	}
	
	
	
	

}
