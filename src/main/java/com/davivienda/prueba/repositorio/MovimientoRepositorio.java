package com.davivienda.prueba.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davivienda.prueba.modelo.Movimiento;

public interface MovimientoRepositorio extends JpaRepository<Movimiento, Long>{}