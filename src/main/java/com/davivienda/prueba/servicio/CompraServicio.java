package com.davivienda.prueba.servicio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davivienda.prueba.modelo.Compra;
import com.davivienda.prueba.repositorio.CompraRepositorio;

@Service
public class CompraServicio {
    
    @Autowired
    CompraRepositorio repositorio;

    public Compra guardar(Compra modelo){
        return repositorio.save(modelo);
    } 

    public ArrayList<Compra> listar(){
        return (ArrayList<Compra>)repositorio.findAll();
    }

    public Compra buscar(String idConsulta){
        Long id = Long.parseLong(idConsulta);
        return repositorio.findById(id).orElse(new Compra());
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
