package com.davivienda.prueba.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davivienda.prueba.modelo.Consignacion;

public interface ConsignacionRepositorio extends JpaRepository<Consignacion, Long>{}
