package com.viajes.viajes.persistence.entity.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String direccionDomicilio;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String docIdentidad;
}
