package com.duoc.traveler_service.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TravelerDTO {
    private Long id;

    private String rutPasaporte;
    private String nombreCompleto;
    private String nacionalidad;
    private int edad;
}
