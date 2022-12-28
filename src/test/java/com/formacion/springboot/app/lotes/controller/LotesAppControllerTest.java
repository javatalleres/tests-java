package com.formacion.springboot.app.lotes.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.formacion.springboot.app.lotes.dto.LoteDTO;
import com.formacion.springboot.app.lotes.models.entity.Cliente;
import com.formacion.springboot.app.lotes.models.entity.Lote;
import com.formacion.springboot.app.lotes.service.ClienteServiceImpl;
import com.formacion.springboot.app.lotes.service.LoteServiceImpl;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class LotesAppControllerTest {

	@Mock
	private LoteServiceImpl loteService;

	@Mock
	private ClienteServiceImpl clienteService;

	@InjectMocks
	private LotesAppController controller;

	@Test
	@Disabled
	public void testRegistrarLote() {

		LoteDTO loteDto = new LoteDTO("lote1", "nombreLote1", new BigDecimal(100), new Date(), 1L);
		Cliente cliente = Cliente.builder().idCliente(1L).build();
		Lote lote = Lote.builder().codLote("lote1").nomLote("nombreLote1").valor(new BigDecimal(100)).cliente(cliente).build();

		when(clienteService.findCliente(Mockito.anyLong())).thenReturn(cliente);
		when(loteService.create(Mockito.any(Lote.class))).thenReturn(lote);

		ResponseEntity<Lote> response = controller.registrarLote(loteDto);
		assertEquals(HttpStatus.CREATED, response.getStatusCode());
		assertEquals(lote, response.getBody());
	}

	@Test
	public void testListarClientes() {
		List<Cliente> clientes = Arrays.asList(Cliente.builder().idCliente(1L).build());
		when(clienteService.getAllClientes()).thenReturn(clientes);

		ResponseEntity<List<Cliente>> response = controller.listarClientes();
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(clientes, response.getBody());
	}

	@Test
	public void testBuscarCliente() {
		Cliente cliente = new Cliente();
		when(clienteService.findCliente(cliente.getIdCliente())).thenReturn(cliente);

		ResponseEntity<Cliente> response = controller.buscarCliente(cliente.getIdCliente());
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
}
