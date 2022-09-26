package com.davivienda.prueba.modelo;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table
@Data
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = Cuenta.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "mc_fk", referencedColumnName = "id")
    private Long cuentaId;
    @ManyToOne(targetEntity = TipoMovimiento.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "mt_fk", referencedColumnName = "id")
    private Long tipoMovimientoId;
    @Column(nullable = false)
    private Date fecha;
    @Column(nullable = false)
    private Time hora; 
    @Column(nullable = false)
    private float valor;
}
