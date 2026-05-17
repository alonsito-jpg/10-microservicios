package com.duoc.seguimiento_service.dto;

import lombok.Data;

@Data
public class SeguimientoDTO {
    private Long id; //Identificador del registro rastreo

    private String patenteCamion; // Identificador del Vehiculo de carga
    private double latitud; // Coordenada geografica para el mapa
    private double longitud; // Coordenada en el mapa
    private String estadoRuta;
}
