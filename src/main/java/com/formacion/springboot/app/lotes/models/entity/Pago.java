package com.formacion.springboot.app.lotes.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pago")
public class Pago implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_comprobante")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codComprobante;

	@Column(name = "fec_ingreso")
	private Date fecIngreso;

	private BigDecimal valor;

	@Column(name = "cod_concepto")
	private Short codConcepto;

	private String descripcion;

	@Column(name = "id_estado")
	private Short idEstado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cod_lote")
	@JsonIgnore
	private Lote lote;
	
	@PrePersist
	private void date() {
		Date date = new Date(); 
		fecIngreso = date;
	}
	
	

}
