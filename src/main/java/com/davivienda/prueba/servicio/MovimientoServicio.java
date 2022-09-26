package com.davivienda.prueba.servicio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davivienda.prueba.modelo.Movimiento;
import com.davivienda.prueba.repositorio.MovimientoRepositorio;

@Service
public class MovimientoServicio {

    @Autowired
    MovimientoRepositorio repositorio;

    public Movimiento guardar(Movimiento modelo){
        return repositorio.save(modelo);
    } 

    public ArrayList<Movimiento> listar(){
        return (ArrayList<Movimiento>)repositorio.findAll();
    }

    public Movimiento buscar(String idConsulta){
        Long id = Long.parseLong(idConsulta);
        return repositorio.findById(id).orElse(new Movimiento());
    } 

    public Boolean existe(String idConsulta){
        Long id = Long.parseLong(idConsulta);
        return repositorio.existsById(id);
    }

    public void eliminar(String idConsulta){
        Long id = Long.parseLong(idConsulta);
        repositorio.deleteById(id);
    }
}
