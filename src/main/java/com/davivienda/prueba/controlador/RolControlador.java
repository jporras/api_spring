package com.davivienda.prueba.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.davivienda.prueba.modelo.Rol;
import com.davivienda.prueba.servicio.RolServicio;

@RestController
@RequestMapping("/api")
public class RolControlador {

    @Autowired
    RolServicio rolServicio;

    @PostMapping("/rol")
    public Rol guardar(@RequestBody Rol rol){
        return rolServicio.guardar(rol);
    }

    @GetMapping("/rol")
    public ArrayList<Rol> listar(){
        return (ArrayList<Rol>) rolServicio.listar();
    }

    @GetMapping("/rol/{id}")
    public Rol buscar(@PathVariable String id){
        return rolServicio.buscar(id);
    }

    @PutMapping("/rol")
    public Rol actualizar(@RequestBody Rol rol){
        return rolServicio.guardar(rol);
    }

    @DeleteMapping("/rol/{id}")
    public Boolean eliminar(@PathVariable String id){
        if(rolServicio.existe(id)){
            rolServicio.eliminar(id);
            return true;
        }else{
            return false;
        }
    }
}
