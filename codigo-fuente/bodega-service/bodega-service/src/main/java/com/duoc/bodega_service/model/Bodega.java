package com.duoc.bodega_service.model;

import jakarta.persistence.*;
import lombok.Data;


@Data //Genera getters y setters automaticamente 
@Entity //Indica que es una tabla MySQL
public class Bodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreArticulo; //Ejemplo:"Electronicos y ropa"
    private String descripcion;
    private int cantidad;
    private String ubicacionPasillo; // Orden fisico de la bodega
}
