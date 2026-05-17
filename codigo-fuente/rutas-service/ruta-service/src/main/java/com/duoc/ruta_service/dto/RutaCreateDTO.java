package com.duoc.ruta_service.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RutaCreateDTO {

    @NotBlank(message = "El punto de origen es obligatorio")
    private String puntoOrigen;

    @NotBlank(message = "El punto de destino es obligatorio")
    private String puntoDestino;

    @Min(value = 0, message = "La distancia debe ser un valor positivo")
    private double distanciaKm;

    @Min(value = 1, message = "El tiempo estimado debe ser un valor positivo")
    private int tiempoEstimadoMin;

}
