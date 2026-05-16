package com.duoc.noti_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data //Genera getters y setters 
@Entity //Indica a Spring que esta Clase es una tabla en MySQL
public class Noti {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String rutViajero; // A quien va dirigida la alerta
    private String mensaje; // El contenido del aviso
    private boolean leido; //Logica para saber si el usuario vio el aviso
}
