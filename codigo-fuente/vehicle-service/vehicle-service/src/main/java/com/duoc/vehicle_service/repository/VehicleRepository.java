package com.duoc.vehicle_service.repository;


import com.duoc.vehicle_service.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
    // Hereda métodos como save(), findAll() y deleteById()
}
