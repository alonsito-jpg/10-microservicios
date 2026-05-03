package com.duoc.traveler_service.controller;

import com.duoc.traveler_service.model.Traveler;
import com.duoc.traveler_service.service.TravelerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/traveler")
public class TravelerController {
    private final TravelerService service;

    public TravelerController(TravelerService service){
        this.service = service;
    }

    @GetMapping
    public List<Traveler>obtenerTodos(){
        return service.listarTodos();
    }

    @PostMapping
    public Traveler crear(@RequestBody Traveler traveler){
        return service.registrar(traveler);
    }

}
