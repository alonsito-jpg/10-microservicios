package com.duoc.vehicle_service.controller;

import com.duoc.vehicle_service.model.Vehicle;
import com.duoc.vehicle_service.service.VehicleService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
    private final VehicleService service;

    public VehicleController(VehicleService service){
        this.service = service;
    }

    @GetMapping //Metodo Http
    public List<Vehicle> obtenerTodos(){
        return service.listarVehiculos();
    }

    @PostMapping//Meotodo HTTP para crear 
    public Vehicle crear(@RequestBody Vehicle vehicle){
        return service.registrarVehiculo(vehicle);
    } 
}
