package com.formacion.springboot.app.lotes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacion.springboot.app.lotes.models.entity.Pago;
import com.formacion.springboot.app.lotes.repository.IPagoRepository;

@Service
public class PagoServiceImpl implements IPagoService{

	@Autowired
	private IPagoRepository pagoRepository;

	@Override
	public Pago crearPago(Pago pago) {
		return pagoRepository.save(pago);
		
	}
	
	
	
	
	
	
}
