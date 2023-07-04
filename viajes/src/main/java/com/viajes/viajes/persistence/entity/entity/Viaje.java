package com.viajes.viajes.persistence.entity.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Viaje")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String destino;
    private String paquetesIncluidos;
    private Date partida;
    private Integer duracionDias;
}
