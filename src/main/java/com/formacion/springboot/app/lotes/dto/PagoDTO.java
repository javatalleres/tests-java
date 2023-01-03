package com.formacion.springboot.app.lotes.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PagoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long codComprobante;
	private Date fecIngreso;
	private BigDecimal valor;
	private Short codConcepto;
	private String descripcion;
	private Short idEstado;
	private String codLote;
	
}
