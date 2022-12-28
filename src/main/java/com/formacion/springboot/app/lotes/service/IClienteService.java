package com.formacion.springboot.app.lotes.service;

import java.util.List;

import com.formacion.springboot.app.lotes.models.entity.Cliente;

public interface IClienteService {

	public Cliente findCliente(Long idCliente);
	
	public List<Cliente> getAllClientes();
}
