package com.formacion.springboot.app.lotes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.formacion.springboot.app.lotes.models.entity.Lote;


@Repository("loteRepository")
public interface ILoteRepository extends JpaRepository<Lote, String> {

	@Query("select l from Lote l where l.cliente.idCliente = :idCliente")
	List<Lote> findByCliente(@Param("idCliente") Long idCliente);
}
