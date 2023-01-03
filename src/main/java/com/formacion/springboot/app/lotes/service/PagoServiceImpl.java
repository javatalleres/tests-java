package com.formacion.springboot.app.lotes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacion.springboot.app.lotes.models.entity.Pago;
import com.formacion.springboot.app.lotes.repository.IPagoRepository;

@Service
public class PagoServiceImpl implements IPagoService{
	
	@Autowired
	private IPagoRepository pagoRepository;

	@Override
	public Pago create(Pago pago) {
		return pagoRepository.save(pago);

	}

	@Override
	public void delete(Pago pago) {
		pagoRepository.delete(pago);
	}

	@Override
	public List<Pago> findPagosByCliente(Long idLote) {
		//return pagoRepository.findByLote(idLote);
		return null;
	}

	@Override
	public List<Pago> getAllPagos() {
		return pagoRepository.findAll();
	}

	@Override
	public Pago findPago(Long codComprobante) {
		return pagoRepository.findById(codComprobante).orElse(null);
	}

}
