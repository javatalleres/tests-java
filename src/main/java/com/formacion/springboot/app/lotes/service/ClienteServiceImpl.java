package com.formacion.springboot.app.lotes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacion.springboot.app.lotes.models.entity.Cliente;
import com.formacion.springboot.app.lotes.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepository clienteRepository;

	@Override
	public Cliente findCliente(Long idCliente) {
		return clienteRepository.findById(idCliente).orElse(null);
	}

	@Override
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}

}
