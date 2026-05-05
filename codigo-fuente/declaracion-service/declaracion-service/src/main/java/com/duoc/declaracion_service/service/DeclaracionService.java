package com.duoc.declaracion_service.service;

import com.duoc.declaracion_service.model.Declaracion;
import com.duoc.declaracion_service.repository.DeclaracionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service//Indica que aquí reside la logica del negocio
public class DeclaracionService {
    private final DeclaracionRepository repository;

    public DeclaracionService(DeclaracionRepository repository){
        this.repository = repository;
    }

    public List<Declaracion> obtenerTodas(){
        return repository.findAll(); //Recupera todos los tramites
    }

    public Declaracion registrar(Declaracion declaracion){
        return repository.save(declaracion); //Guarda la declaracion en MySQL
    }




}
