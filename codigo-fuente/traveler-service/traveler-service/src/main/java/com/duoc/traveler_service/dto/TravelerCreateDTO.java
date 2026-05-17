package com.duoc.traveler_service.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TravelerCreateDTO {

    @NotBlank(message = "El RUT o pasaporte es obligatorio")
    private String rutPasaporte;

    @NotBlank(message = "El nombre completo es obligatorio")
    private String nombreCompleto;

    @NotBlank(message = "La nacionalidad es obligatoria")
    private String nacionalidad;

    @NotBlank(message = "La edad es obligatoria")
    private int edad;
}
