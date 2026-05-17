package com.duoc.vehicle_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class VehicleCreateDTO {

    @NotBlank(message = "La patente es obligatoria")
    private String patente;

    @NotBlank(message = "La marca es obligatoria")
    private String marca;

    @NotBlank(message = "El modelo es obligatorio")
    private String modelo;

    @Min(value = 1900, message = "Ingrese un año de fabricación válido")
    private int anio;

    @NotBlank(message = "El RUT del dueño es obligatorio")
    private String rutDuenio;

}
