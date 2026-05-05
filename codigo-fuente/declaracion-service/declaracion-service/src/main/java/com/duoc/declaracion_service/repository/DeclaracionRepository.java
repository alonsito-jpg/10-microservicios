package com.duoc.declaracion_service.repository;

import com.duoc.declaracion_service.model.Declaracion;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository//Marca esta interfaz para que Spring la gestione
public interface DeclaracionRepository {

    List<Declaracion> findAll();
    //Aquí heredamos los métodos save() y findAll() automáticamente

    Declaracion save(Declaracion declaracion);
}
