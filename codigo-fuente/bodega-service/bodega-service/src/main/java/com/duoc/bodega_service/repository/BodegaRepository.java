package com.duoc.bodega_service.repository;

import com.duoc.bodega_service.model.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BodegaRepository  extends JpaRepository<Bodega, Long>{
 //Spring Data Jpa ya nos entrega métodos como save() y findAll()
}
