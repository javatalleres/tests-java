package com.formacion.springboot.app.lotes.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formacion.springboot.app.lotes.models.entity.Lote;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PagoDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long codComprobante;

	private Date fecIngreso;

	private BigDecimal valor;

	private Short codConcepto;

	private String descripcion;

	private Short idEstado;

	private String codLote;
}
