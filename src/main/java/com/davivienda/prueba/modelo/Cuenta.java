package com.davivienda.prueba.modelo;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table
@Data
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private Long numeroDocumento;
    @Column(nullable = false)
    private Long numeroCuenta;
    @Column(nullable = false)
    private Float cupo;
}
