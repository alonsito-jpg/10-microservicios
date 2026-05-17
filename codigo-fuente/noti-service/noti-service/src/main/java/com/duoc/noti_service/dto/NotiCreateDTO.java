package com.duoc.noti_service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class NotiCreateDTO {
    @NotBlank(message = "El rut del viajero es obligatorio")
    private String rutViajero; // A quien va dirigida la alerta

    @NotBlank(message = "El mensaje es obligatorio")
    private String mensaje; // El contenido del aviso
}
