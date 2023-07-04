package com.viajes.viajes.service.dto;

import lombok.Data;

@Data
public class HotelInDTO {
    private String nombre;
    private Integer cantEstrellas;
    private String ubicacion;
    private boolean todoIncluido;
    private Integer duracionEstanciaDias;
    private String serviciosExtras;
}
