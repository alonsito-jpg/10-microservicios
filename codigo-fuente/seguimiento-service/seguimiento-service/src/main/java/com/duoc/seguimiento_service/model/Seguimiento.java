package com.duoc.seguimiento_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data //Genera getters y setters
@Entity // Define esta clase como una tabla 
public class Seguimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Identificador del registro rastreo

    private String patenteCamion; // Identificador del Vehiculo de carga
    private double latitud; // Coordenada geografica para el mapa
    private double longitud; // Coordenada en el mapa
    private String estadoRuta; //Ej: "En transito o Destino"
}
