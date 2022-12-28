package com.formacion.springboot.app.lotes.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoteDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String codLote;
	private String nomLote;
	private BigDecimal valor;
	private Date fecAlta;
	private Long idCliente;

}
