package com.formacion.springboot.app.lotes.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.formacion.springboot.app.lotes.models.entity.Lote;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class LoteServiceImplTest {

	@Mock
	LoteServiceImpl loteService;

	@Test
	void testCreate() {
		Lote nuevoLote = Lote.builder().codLote("L001").build();
		when(loteService.create(nuevoLote)).thenReturn(Lote.builder().codLote("L001").build());
		assertNotNull(nuevoLote);
	}

	@Test
	@Disabled
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testFindLotesByCliente() {
		fail("Not yet implemented");
	}

}
