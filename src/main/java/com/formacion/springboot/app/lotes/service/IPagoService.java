package com.formacion.springboot.app.lotes.service;

import java.util.List;

import com.formacion.springboot.app.lotes.models.entity.Cliente;
import com.formacion.springboot.app.lotes.models.entity.Lote;
import com.formacion.springboot.app.lotes.models.entity.Pago;

public interface IPagoService {
	public Pago create(Pago pago);

	public void delete(Pago pago);

	public List<Pago> findPagosByCliente(Long idCliente);

	public List<Pago> getAllPagos();
	
	public Pago findPago(Long codComprobante);
	
	
}
