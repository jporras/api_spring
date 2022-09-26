package com.davivienda.prueba.modelo;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table
@Data
public class Consignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Float valor;
   
}
