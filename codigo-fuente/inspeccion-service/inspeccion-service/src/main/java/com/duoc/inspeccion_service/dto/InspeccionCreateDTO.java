package com.duoc.inspeccion_service.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Future;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class InspeccionCreateDTO {
    @NotNull (message = "La patente del vehículo es obligatoria")
    private String patenteVehiculo; //El vehiculo que estamos revisando

    @NotNull (message = "El ID del inspector es obligatorio")
    private Long idInspector; //El id del funcionario del 'personal-service'

    @NotNull (message = "El resultado de la inspección es obligatorio")
    private String resultado; //Ej: aprobado o rechazado
    @NotNull (message = "Las observaciones son obligatorias")
    private String observaciones; // Detalles técnicos

    @Future (message = "La fecha de inspección debe ser en el futuro")
    private LocalDateTime fechaInspeccion; //Fecha y hora de la inspección
}
