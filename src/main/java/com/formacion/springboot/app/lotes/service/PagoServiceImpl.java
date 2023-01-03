package com.formacion.springboot.app.lotes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacion.springboot.app.lotes.models.entity.Pago;
import com.formacion.springboot.app.lotes.repository.IPagoRepository;
@Service
public class PagoServiceImpl implements IPagoService {
	@Autowired
	private IPagoRepository pagoRepository;

	@Override
	public List<Pago> getAllPagos() {
		// TODO Auto-generated method stub
		return pagoRepository.findAll();
	}

	@Override
	public Pago getPagoById(Long idComprobante) {
		// TODO Auto-generated method stub
		return pagoRepository.findById(idComprobante).orElse(null);
	}

	@Override
	public Pago create(Pago pago) {
		// TODO Auto-generated method stub
		return pagoRepository.save(pago);
	}

}
