package com.viajes.viajes.service.dto;

import lombok.Data;
import java.util.Date;

@Data
public class ClienteInDTO {
    private String nombre;
    private String apellido;
    private String direccionDomicilio;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String docIdentidad;
}