package com.duoc.declaracion_service.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DeclaracionCreateDTO {
    
    @NotNull(message = "La declaracion debe estar asociada a un viajero")
    private Long viajeroId;
    
    
    @NotBlank(message = "El viajero debe proporcionar su RUT o pasaporte")
    private String rutPasaporte; //Identificador

    @NotBlank(message = "El campo 'descripcionCarga' no puede estar vacío")
    private String descripcionCarga;

    @NotBlank (message = "Debe declarar si trae alimentos o no")
    private boolean traeAlimentos;
}
