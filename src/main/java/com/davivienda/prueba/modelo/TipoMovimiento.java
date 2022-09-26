package com.davivienda.prueba.modelo;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table
@Data
public class TipoMovimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String codigo;
    @Column(nullable = false)
    private String descripcion;
}
