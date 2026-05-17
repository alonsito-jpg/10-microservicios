package com.duoc.personal_service.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDto {
    private Long id;

    private String nombreCompleto;
    private String institucion;
    private String cargo;
    private boolean enTurno;
}
