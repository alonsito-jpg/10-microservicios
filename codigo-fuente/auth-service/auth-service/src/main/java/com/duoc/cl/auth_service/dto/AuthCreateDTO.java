package com.duoc.cl.auth_service.dto;

import jakarta.validation.constrainsts.NotBlank;
import lombok.Data;

@Data
public class AuthCreateDTO {
    @NotBlank(message = "El nombre de usuario es obligatorio")
    private String username;

    @NotBlank(message = "La contraseña es obligatoria")
    private String password; //Aqui la recibimos para procesar el registro

    @NotBlank(message = "El rol es obligatorio")
    private String rol; //Aqui la recibimos para procesar el registro
}
