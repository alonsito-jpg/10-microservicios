package com.duoc.bodega_service.service;

import com.duoc.bodega_service.model.Bodega;
import com.duoc.bodega_service.repository.BodegaRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BodegaService {
    private final BodegaRepository repository;

    //Inyectamos el repositorio por constructor
    public BodegaService(BodegaRepository repository){
        this.repository = repository;
    }

    public List<Bodega> listarTodo(){
        return repository.findAll();
    }

    public Bodega registrar(Bodega bodega){
        return repository.save(bodega);
    }

}
