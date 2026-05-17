package com.duoc.bodega_service.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BodegaDTO {
    private Long id;

    private String nombreArticulo; //Ejemplo:"Electronicos y ropa"
    private String descripcion;
    private int cantidad;
    private String ubicacionPasillo;
}
