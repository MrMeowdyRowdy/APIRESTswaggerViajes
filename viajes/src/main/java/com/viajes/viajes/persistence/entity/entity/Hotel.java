package com.viajes.viajes.persistence.entity.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nombre;
    private Integer cantEstrellas;
    private String ubicacion;
    private boolean todoIncluido;
    private Integer duracionEstanciaDias;
    private String serviciosExtras;
}
