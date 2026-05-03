package com.duoc.vehicle_service.service;

import com.duoc.vehicle_service.model.Vehicle;
import com.duoc.vehicle_service.repository.VehicleRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service//Marca la clase como componente de logica de negocio
public class VehicleService {
    private final VehicleRepository repository;

    //Inyección de dependencias por constructor
    public VehicleService(VehicleRepository repository){
        this.repository = repository;
    }

    public List<Vehicle> listarVehiculos(){
        return repository.findAll();//Llama al repo para obetene todos los registros
    }

    public Vehicle registrarVehiculo(Vehicle vehicle){
        return repository.save(vehicle);
    }
}   
