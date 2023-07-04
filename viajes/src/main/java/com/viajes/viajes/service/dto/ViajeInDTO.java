package com.viajes.viajes.service.dto;

import lombok.Data;
import java.util.Date;

@Data
public class ViajeInDTO {
    private String destino;
    private String paquetesIncluidos;
    private Date partida;
    private Integer duracionDias;
}
