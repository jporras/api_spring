package com.davivienda.prueba.modelo;

import java.util.List;

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
    @OneToMany(targetEntity = Movimiento.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cm_fk", referencedColumnName = "id")
    private List<Movimiento> movimientos;
}
