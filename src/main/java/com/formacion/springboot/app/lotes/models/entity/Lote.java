package com.formacion.springboot.app.lotes.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "lote")
public class Lote implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_lote")
	private String codLote;

	@Column(name = "nom_lote")
	private String nomLote;

	private BigDecimal valor;

	@Column(name = "fec_alta")
	private Date fecAlta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	@JsonIgnore
	private Cliente cliente;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lote")
	List<Pago> pagos;

}
