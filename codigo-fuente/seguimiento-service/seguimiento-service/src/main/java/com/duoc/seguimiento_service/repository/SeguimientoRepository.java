package com.duoc.seguimiento_service.repository;

import com.duoc.seguimiento_service.model.Seguimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;;

@Repository //Permite que Spring maneje los datos
public interface SeguimientoRepository extends JpaRepository<Seguimiento, Long> {
    // Al extender JpaRepository obtenemos save
}
