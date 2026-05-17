package com.duoc.seguimiento_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SeguimientoCreateDTO {

    @NotBlank(message = "La patente del camión es obligatoria") // Validación de seguridad
    private String patenteCamion;

    @NotNull(message = "La latitud es requerida para el rastreo GPS")
    private double latitud;

    @NotNull(message = "La longitud es requerida para el rastreo GPS")
    private double longitud;

    @NotBlank(message = "Debe especificar el estado inicial de la ruta")
    private String estadoRuta;
}
