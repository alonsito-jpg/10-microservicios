package com.duoc.ruta_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // lombok: genera los metodos 
@Entity // Indica a Spring que esta clase es una tabla sql 
public class Ruta {
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Identificador único de la ruta

    private String puntoOrigen; // Ej: "Paso Pehuenche"
    private String puntoDestino; // ej: Malargüe
    private double distanciaKm; //Distancia calculada entre puntos
    private int tiempoEstimadoMin; //Basado en el flujo fronterizo actual

}
