package com.formacion.springboot.app.lotes.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class PagoDTO {
	
	
	private String codeLote;
	private BigDecimal pago;
	private Short codConsepto;
	private String descripcion;
	

}
