package com.duoc.personal_service.model;

import jakarta.persistence.*;
import lombok.Data;


@Data // lombok genera automaticamente los metodos para acceder y modificar variables 
@Entity // marca la clase como una tabla real en MySql
public class Personal {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Identificador unico del funcionario 

    private String nombreCompleto;
    private String institucion; //Aduana, SAG O PDI
    private String cargo;
    private boolean enTurno; //Lógica disponibilidad operativa 

    
}
