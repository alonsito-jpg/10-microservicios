package com.duoc.declaracion_service.model;
import jakarta.persistence.*;
import lombok.Data;


@Data //Genera automaticamente getters/setters para evitar codigo repetitivo
@Entity //Define esta clase como una tabla en Mysql
public class Declaracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rutPasaporte; //Identificador
    private String descripcionCarga;//Lo que el viajero declara
    private double valorEstimado;
    private boolean traeAlimentos; // Requerimientos
}
