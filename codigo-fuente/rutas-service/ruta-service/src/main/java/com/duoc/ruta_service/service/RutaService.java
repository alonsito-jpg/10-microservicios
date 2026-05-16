package com.duoc.ruta_service.service;

import com.duoc.ruta_service.model.Ruta;
import com.duoc.ruta_service.repository.RutaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service //Indica que aquí reside la lógica de negocio 
public class RutaService {
    private final RutaRepository repository;

    //Inyección de dependencias por constructor para mayor estabilidad
    public RutaService(RutaRepository repository){
        this.repository = repository;
    }

    //Listar
    public List<Ruta> obtenerTodas(){
        return repository.findAll();
    }

    public Ruta registrarRuta(Ruta ruta){
        return repository.save(ruta); //Guarda el nuevo cálculo de ruta
    }

}
