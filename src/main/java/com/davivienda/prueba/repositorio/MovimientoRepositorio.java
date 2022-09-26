package com.davivienda.prueba.repositorio;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davivienda.prueba.modelo.Movimiento;

public interface MovimientoRepositorio extends JpaRepository<Movimiento, Long>{
    ArrayList<Movimiento> findByCuentaId(Long cuentaId);
}