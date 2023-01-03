package com.formacion.springboot.app.lotes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.formacion.springboot.app.lotes.models.entity.Lote;
import com.formacion.springboot.app.lotes.models.entity.Pago;

@Repository("pagoRepository")
public interface IPagoRepository extends JpaRepository<Pago, Long> {
	
	//@Query("select l from Pago l where l.lote.cod_lote = :idLote")
	//List<Pago> findByLote(@Param("idLote") Long idLote);

}
 