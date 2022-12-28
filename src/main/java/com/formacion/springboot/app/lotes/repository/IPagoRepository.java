package com.formacion.springboot.app.lotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formacion.springboot.app.lotes.models.entity.Pago;

@Repository("pagoRepository")
public interface IPagoRepository extends JpaRepository<Pago, String> {

}
 