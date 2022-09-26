package com.davivienda.prueba.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.davivienda.prueba.modelo.Consignacion;
import com.davivienda.prueba.servicio.ConsignacionServicio;

@RestController
@RequestMapping("/api")
public class ConsignacionControlador {
    
    @Autowired
    ConsignacionServicio consignacionServicio;

    @PostMapping("/consignacion")
    public Consignacion guardar(@RequestBody Consignacion consignacion){
        return consignacionServicio.guardar(consignacion);
    }

    @GetMapping("/consignacion")
    public ArrayList<Consignacion> listar(){
        return (ArrayList<Consignacion>) consignacionServicio.listar();
    }

    @GetMapping("/consignacion/{id}")
    public Consignacion buscar(@PathVariable String id){
        return consignacionServicio.buscar(id);
    }

    @PutMapping("/consignacion")
    public Consignacion actualizar(@RequestBody Consignacion consignacion){
        return consignacionServicio.guardar(consignacion);
    }

    @DeleteMapping("/consignacion/{id}")
    public Boolean eliminar(@PathVariable String id){
        if(consignacionServicio.existe(id)){
            consignacionServicio.eliminar(id);
            return true;
        }else{
            return false;
        }
    }
}