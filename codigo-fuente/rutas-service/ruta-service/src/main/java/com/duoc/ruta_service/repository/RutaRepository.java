package com.duoc.ruta_service.repository;

import com.duoc.ruta_service.model.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marca esta interfaz
public interface RutaRepository extends JpaRepository<Ruta, Long>{
    // Al heredar Jpa
}
