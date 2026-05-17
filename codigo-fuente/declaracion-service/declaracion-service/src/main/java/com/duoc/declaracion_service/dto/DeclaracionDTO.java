package com.duoc.declaracion_service.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class DeclaracionDTO {
    private Long id;

    private String rutPasaporte; //Identificador
    private String descripcionCarga;//Lo que el viajero declara
    private double valorEstimado;
    private boolean traeAlimentos; // Requerimientos
}
