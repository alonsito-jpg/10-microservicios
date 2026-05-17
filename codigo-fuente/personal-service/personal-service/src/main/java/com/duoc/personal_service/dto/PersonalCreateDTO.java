package com.duoc.personal_service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PersonalCreateDTO {
    @NotBlank(message = "El nombre del funcionario es obligatorio")
    private String nombreCompleto;

    @NotBlank(message = "Debe especificar la institución a la que pertenece el funcionario")
    private String institucion;

    @NotBlank(message = "El cargo del funcionario es obligatorio")
    private String cargo;
    
    private boolean enTurno;
}
