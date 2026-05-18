package com.duoc.bodega_service.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BodegaCreateDTO {
    @NotNull(message = "El id no puede ser nulo") // validacion de campos
    private Long id;
    
    @NotBlank(message = "El nombre del articulo es obligatorio") // validacion de campos
    private String nombreArticulo; //Ejemplo:"Electronicos y ropa"
    @NotBlank(message = "La descripcion es obligatoria")
    private String descripcion;
    @Min(value = 0, message = "La cantidad no puede ser negativa")
    private int cantidad;
    @NotBlank(message = "La ubicacion del pasillo es obligatoria")
    private String ubicacionPasillo; // Orden fisico de la bodega
}
