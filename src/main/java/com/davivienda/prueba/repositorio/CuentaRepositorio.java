package com.davivienda.prueba.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davivienda.prueba.modelo.Cuenta;

public interface CuentaRepositorio extends JpaRepository<Cuenta, Long>{}