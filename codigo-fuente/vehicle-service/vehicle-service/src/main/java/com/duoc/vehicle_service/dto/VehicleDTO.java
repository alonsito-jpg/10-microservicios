package com.duoc.vehicle_service.dto;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {
    private Long id;
    private String patente;//patente del vehiculo
    private String marca;
    private String modelo;
    private int anio;
    private String rutDuenio;
}
