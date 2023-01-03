package com.formacion.springboot.app.lotes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacion.springboot.app.lotes.models.entity.Lote;
import com.formacion.springboot.app.lotes.repository.ILoteRepository;

@Service
public class LoteServiceImpl implements ILoteService {

	@Autowired
	private ILoteRepository loteRepository;

	@Override
	public Lote create(Lote lote) {
		return loteRepository.save(lote);
	}

	@Override
	public void delete(Lote lote) {
		loteRepository.delete(lote);
	}

	@Override
	public List<Lote> findLotesByCliente(Long idCliente) {
		return loteRepository.findByCliente(idCliente);
	}

	@Override
	public Lote findLote(String CodigoLote) {
		return loteRepository.getById(CodigoLote);
	}
}
