package com.duoc.ruta_service.controller;

import com.duoc.ruta_service.model.Ruta;
import com.duoc.ruta_service.service.RutaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController // Define que esta clase es una API Rest
@RequestMapping("/api/rutas")
public class RutaController {
    private final RutaService service;

    public RutaController(RutaService service){
        this.service = service;
    }

    @GetMapping //Atiende solicitudes GET 
    public List<Ruta> listar(){
        return service.obtenerTodas();
    }

    @PostMapping //Atiende solicitudes Post 
    public Ruta crear(@RequestBody Ruta ruta){
        return service.registrarRuta(ruta); //Recibe el JSON
    }
}
