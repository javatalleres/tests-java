package com.formacion.springboot.app.lotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.springboot.app.lotes.dto.LoteDTO;
import com.formacion.springboot.app.lotes.models.entity.Cliente;
import com.formacion.springboot.app.lotes.models.entity.Lote;
import com.formacion.springboot.app.lotes.service.IClienteService;
import com.formacion.springboot.app.lotes.service.ILoteService;

@RestController
@RequestMapping("/api/lotes")
public class LotesAppController {

	@Autowired
	private ILoteService loteService;

	@Autowired
	private IClienteService clienteService;

	@PostMapping(value = "/registrar/lote") 
	public ResponseEntity<Lote> registrarLote(@RequestBody LoteDTO loteDto) {

		Cliente cliente = clienteService.findCliente(loteDto.getIdCliente());
		Lote temp = loteService
				.create(Lote.builder().codLote(loteDto.getCodLote()).nomLote(loteDto.getNomLote())
						.valor(loteDto.getValor()).cliente(cliente).build());
		return new ResponseEntity<>(temp, HttpStatus.CREATED);
	}

	@GetMapping(value = "/listar/clientes") 
	public ResponseEntity<List<Cliente>> listarClientes() {
		List<Cliente> clientes = clienteService.getAllClientes();
		return new ResponseEntity<>(clientes, HttpStatus.OK);
	}

	@GetMapping(value = "/buscar/cliente/{idCliente}") 
	public ResponseEntity<Cliente> buscarCliente(@PathVariable ("idCliente") Long idCliente) {
		Cliente cliente = clienteService.findCliente(idCliente);
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}
	
	@GetMapping("/buscar/lote/{codLote}")
	public ResponseEntity<Lote> buscarLote (@PathVariable("codLote") String codLote){
		Lote lote = loteService.findById(codLote);
		return new ResponseEntity<>(lote, HttpStatus.OK);
	}
}
