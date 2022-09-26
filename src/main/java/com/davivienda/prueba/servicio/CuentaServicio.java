package com.davivienda.prueba.servicio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davivienda.prueba.modelo.Cuenta;
import com.davivienda.prueba.repositorio.CuentaRepositorio;

@Service
public class CuentaServicio{
    
    @Autowired
    CuentaRepositorio repositorio;

    public Cuenta guardar(Cuenta cuenta){
        return repositorio.save(cuenta);
    } 

    public ArrayList<Cuenta> listar(){
        return (ArrayList<Cuenta>)repositorio.findAll();
    }

    public Cuenta buscar(String idConsulta){
        Long id = Long.parseLong(idConsulta);
        return repositorio.findById(id).orElse(new Cuenta());
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
