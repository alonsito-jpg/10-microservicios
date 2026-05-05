package com.duoc.declaracion_service.controller;

import com.duoc.declaracion_service.model.Declaracion;
import com.duoc.declaracion_service.service.DeclaracionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController //Define que esta clase es una API REST
@RequestMapping("/api/declaraciones") // URL base prolija en plural
public class DeclaracionController {
    private final DeclaracionService service;
    
    public DeclaracionController(DeclaracionService service){
        this.service = service;
    }

    @GetMapping 
    public List<Declaracion> listar () {
        return service.obtenerTodas();
    }

    @PostMapping
    public Declaracion crear(@RequestBody Declaracion declaracion){
        return service.registrar(declaracion); //Recibe el JSON de Postman
    }
}
