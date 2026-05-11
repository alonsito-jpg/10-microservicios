package com.duoc.seguimiento_service.controller;

import com.duoc.seguimiento_service.model.Seguimiento;
import com.duoc.seguimiento_service.service.SeguimientoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController //Expone los métodos como servicios web
@RequestMapping("/api/seguimientos") //URL descriptiva en plural para recursos
public class SeguimientoController {
    private final SeguimientoService service;
    
    public SeguimientoController(SeguimientoService service){
        this.service = service;
    }

    @GetMapping // Método GET para listar todos los rastreos 
    public List<Seguimiento> listar(){
        return service.obtenerTodoElRastreo();
    }


    @PostMapping //Método POst para crear nuevo registro
    public Seguimiento crear(@RequestBody Seguimiento seguimiento){
        return service.registrarPosicion(seguimiento); // Recibe el Json
    }




}
