package com.duoc.inspeccion_service.service;

import com.duoc.inspeccion_service.model.Inspeccion;
import com.duoc.inspeccion_service.repository.InspeccionRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class InspeccionService {
    private final InspeccionRepository repository;


    //Inyeccion del repositorio
    public InspeccionService(InspeccionRepository repository){
        this.repository = repository;
    }

    public List<Inspeccion> listarTodas(){
        return repository.findAll();
    }

    public Inspeccion registrar(Inspeccion inspeccion){
        return repository.save(inspeccion); 
    }

}
