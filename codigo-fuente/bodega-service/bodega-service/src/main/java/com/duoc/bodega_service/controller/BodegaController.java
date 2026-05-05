package com.duoc.bodega_service.controller;

import com.duoc.bodega_service.model.Bodega;
import com.duoc.bodega_service.service.BodegaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bodega") //url 
public class BodegaController {
    private final BodegaService service;

    public BodegaController(BodegaService service){
        this.service = service;
    }

    @GetMapping
    public List<Bodega> obtenerInventario(){
        return service.listarTodo();
    }

    @PostMapping
    public Bodega agregar(@RequestBody Bodega producto){
        return service.registrar(producto);
    }
    
}
