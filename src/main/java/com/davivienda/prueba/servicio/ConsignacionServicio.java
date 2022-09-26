package com.davivienda.prueba.servicio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davivienda.prueba.modelo.Consignacion;
import com.davivienda.prueba.repositorio.ConsignacionRepositorio;

@Service
public class ConsignacionServicio {

    @Autowired
    ConsignacionRepositorio repositorio;
    
    public Consignacion guardar(Consignacion modelo){
        return repositorio.save(modelo);
    } 

    public ArrayList<Consignacion> listar(){
        return (ArrayList<Consignacion>)repositorio.findAll();
    }

    public Consignacion buscar(String idConsulta){
        Long id = Long.parseLong(idConsulta);
        return repositorio.findById(id).orElse(new Consignacion());
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
