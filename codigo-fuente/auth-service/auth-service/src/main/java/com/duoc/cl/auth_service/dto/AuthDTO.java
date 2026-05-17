package com.duoc.cl.auth_service.dto;

import lombok.Data;

@Data
public class AuthDTO {
    private Long id;    
    private String username;
    private String rol; 
    //aqui no incluimos la contraseña porque no queremos exponerla en las respuestas de la API
}
