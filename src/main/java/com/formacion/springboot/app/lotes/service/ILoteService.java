package com.formacion.springboot.app.lotes.service;

import java.util.List;

import com.formacion.springboot.app.lotes.models.entity.Lote;

public interface ILoteService {

	public Lote create(Lote lote);

	public void delete(Lote lote);

	public List<Lote> findLotesByCliente(Long idCliente);

	Lote findById(String idLote);
}
