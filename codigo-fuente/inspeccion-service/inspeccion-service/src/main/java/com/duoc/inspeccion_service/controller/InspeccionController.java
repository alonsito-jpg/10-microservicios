package com.duoc.inspeccion_service.controller;

import com.duoc.inspeccion_service.model.Inspeccion;
import com.duoc.inspeccion_service.service.InspeccionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inspecciones") //url
public class InspeccionController {
    private final InspeccionService service;
    

    public InspeccionController(InspeccionService service){
        this.service = service;
    }

    @GetMapping //Método GET
    public List<Inspeccion> obtenerHistorial(){
        return service.listarTodas();
    }

}
