package com.duoc.noti_service.dto;

import lombok.Data;
public class NotiDTO {
    private Long id;

    private String rutViajero; // A quien va dirigida la alerta
    private String mensaje; // El contenido del aviso
    private boolean leido; //Logica para saber si el usuario vio el aviso
}

