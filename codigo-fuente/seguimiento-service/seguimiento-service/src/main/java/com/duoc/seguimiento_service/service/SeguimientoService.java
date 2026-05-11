package com.duoc.seguimiento_service.service;

import com.duoc.seguimiento_service.model.Seguimiento;
import com.duoc.seguimiento_service.repository.SeguimientoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SeguimientoService {
    private final SeguimientoRepository repository;

    // Inyección de dependencias por constructor
    public SeguimientoService(SeguimientoRepository repository){
        this.repository = repository;
    }

    public List<Seguimiento> obtenerTodoElRastreo(){
        return repository.findAll(); //Recupera todaas las posiciones gps
    }

    public Seguimiento registrarPosicion(Seguimiento seguimiento){
        return repository.save(seguimiento); //guarda la nueva coordenada en db
    }
}
