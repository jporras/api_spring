package com.davivienda.prueba.modelo;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table
@Data
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String imagen;
    @Column(nullable = false)
    private Float valor;
   
}
