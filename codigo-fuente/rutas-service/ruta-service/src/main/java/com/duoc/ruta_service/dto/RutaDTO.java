package com.duoc.ruta_service.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RutaDTO {
    private long id;
    private String puntoOrigen; // Ej: "Paso Pehuenche"
    private String puntoDestino; // ej: Malargüe
    private double distanciaKm; //Distancia calculada entre puntos
    private int tiempoEstimadoMin;
}
