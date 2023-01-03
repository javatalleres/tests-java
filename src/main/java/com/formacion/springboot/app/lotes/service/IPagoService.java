package com.formacion.springboot.app.lotes.service;

import java.util.List;

import com.formacion.springboot.app.lotes.models.entity.Pago;

public interface IPagoService {
	List<Pago> getAllPagos();
	Pago getPagoById(Long idComprobante);
	Pago create(Pago pago);

}
