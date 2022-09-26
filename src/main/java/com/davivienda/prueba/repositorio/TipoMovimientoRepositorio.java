package com.davivienda.prueba.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davivienda.prueba.modelo.TipoMovimiento;

public interface TipoMovimientoRepositorio extends JpaRepository<TipoMovimiento, Long>{}