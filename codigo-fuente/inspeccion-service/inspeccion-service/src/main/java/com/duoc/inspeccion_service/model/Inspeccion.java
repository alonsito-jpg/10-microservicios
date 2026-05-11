package com.duoc.inspeccion_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // lombok: genera getters y setters
@Entity //Indica a Spring que esta clase es una tabla
public class Inspeccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Identificador incremental

    private String patenteVehiculo; //El vehiculo que estamos revisando
    private Long idInspector; //El id del funcionario del 'personal-service'
    private String resultado; //Ej: aprobado o rechazado
    private String observaciones; // Detalles técnicos

}
