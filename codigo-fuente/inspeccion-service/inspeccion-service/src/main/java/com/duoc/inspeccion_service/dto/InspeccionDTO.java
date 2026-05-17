package com.duoc.inspeccion_service.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class InspeccionDTO {

    private Long id; //Identificador incremental

    private String patenteVehiculo; //El vehiculo que estamos revisando
    private Long idInspector; //El id del funcionario del 'personal-service'
    private String resultado; //Ej: aprobado o rechazado
    private String observaciones; // Detalles técnicos


}
