package com.formacion.springboot.app.lotes.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long idCliente;

	private String nombre;

	private String apellidos;

	@Column(name = "fec_alta")
	private Date fecAlta;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	List<Lote> lotes;
	
}
