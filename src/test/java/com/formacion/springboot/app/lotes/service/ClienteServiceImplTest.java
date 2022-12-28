package com.formacion.springboot.app.lotes.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.formacion.springboot.app.lotes.models.entity.Cliente;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class ClienteServiceImplTest {

	@Mock
	private ClienteServiceImpl clienteService;

	@Test
	void testFindCliente() {
		Long idCliente = 1L;
		Cliente esperado = Cliente.builder().idCliente(1L).build();
		when(clienteService.findCliente(idCliente)).thenReturn(esperado);
		assertEquals(idCliente, esperado.getIdCliente());
	}

	@Test
	void testGetAllClientes() {
		List<Cliente> listaEsperada = Arrays.asList(Cliente.builder().idCliente(1L).build(),
				Cliente.builder().idCliente(2L).build());
		when(clienteService.getAllClientes()).thenReturn(listaEsperada);
	}

}
