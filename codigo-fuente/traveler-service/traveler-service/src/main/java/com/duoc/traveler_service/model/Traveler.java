package com.duoc.traveler_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Traveler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rutPasaporte;
    private String nombreCompleto;
    private String nacionalidad;
    private int edad;
}
