package com.davivienda.prueba.servicio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davivienda.prueba.modelo.Rol;
import com.davivienda.prueba.repositorio.RolRepositorio;

@Service
public class RolServicio {
    @Autowired
    RolRepositorio repositorio;

    public Rol guardar(Rol modelo){
        return repositorio.save(modelo);
    } 

    public ArrayList<Rol> listar(){
        return (ArrayList<Rol>)repositorio.findAll();
    }

    public Rol buscar(String idConsulta){
        Long id = Long.parseLong(idConsulta);
        return repositorio.findById(id).orElse(new Rol());
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
