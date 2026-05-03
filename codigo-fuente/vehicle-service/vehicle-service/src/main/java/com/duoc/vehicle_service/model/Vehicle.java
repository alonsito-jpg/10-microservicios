package com.duoc.vehicle_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//Identificador unico interno
    
    private String patente;//patente del vehiculo
    private String marca;
    private String modelo;
    private int anio;
    private String rutDuenio;//rut propietario para validación cruzada
}
