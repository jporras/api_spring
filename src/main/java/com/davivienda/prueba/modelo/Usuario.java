package com.davivienda.prueba.modelo;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreUsuario;
    @Column(nullable = false)
    private String clave;
    @Column(nullable = false)
    private String nombres;
    @Column(nullable = false)
    private String apellidos;

    @OneToMany(targetEntity = Rol.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ur_fk", referencedColumnName = "id")
    private List<Rol> roles;
}
