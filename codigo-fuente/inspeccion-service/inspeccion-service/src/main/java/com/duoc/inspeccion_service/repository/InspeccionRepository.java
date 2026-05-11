package com.duoc.inspeccion_service.repository;

import com.duoc.inspeccion_service.model.Inspeccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspeccionRepository extends JpaRepository<Inspeccion, Long>{

}
