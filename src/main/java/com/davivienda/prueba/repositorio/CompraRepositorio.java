package com.davivienda.prueba.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davivienda.prueba.modelo.Compra;

public interface CompraRepositorio extends JpaRepository<Compra, Long>{}