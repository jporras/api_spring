package com.davivienda.prueba.servicio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davivienda.prueba.modelo.TipoMovimiento;
import com.davivienda.prueba.repositorio.TipoMovimientoRepositorio;

@Service
public class TipoMovimientoServicio {

    @Autowired
    TipoMovimientoRepositorio repositorio;

    public TipoMovimiento guardar(TipoMovimiento modelo){
        return repositorio.save(modelo);
    } 

    public ArrayList<TipoMovimiento> listar(){
        return (ArrayList<TipoMovimiento>)repositorio.findAll();
    }

    public TipoMovimiento buscar(String idConsulta){
        Long id = Long.parseLong(idConsulta);
        return repositorio.findById(id).orElse(new TipoMovimiento());
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
