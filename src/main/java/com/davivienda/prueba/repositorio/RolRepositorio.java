package com.davivienda.prueba.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davivienda.prueba.modelo.Rol;

public interface RolRepositorio extends JpaRepository<Rol, Long>{}