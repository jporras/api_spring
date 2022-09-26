package com.davivienda.prueba.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.davivienda.prueba.modelo.Cuenta;
import com.davivienda.prueba.servicio.CuentaServicio;

@RestController
@RequestMapping("/api")
public class CuentaControlador {

    @Autowired
    CuentaServicio cuentaServicio;

    @PostMapping("/cuenta")
    public Cuenta guardar(@RequestBody Cuenta cuenta){
        return cuentaServicio.guardar(cuenta);
    }

    @GetMapping("/cuenta")
    public ArrayList<Cuenta> listar(){
        return (ArrayList<Cuenta>) cuentaServicio.listar();
    }

    @GetMapping("/cuenta/{id}")
    public Cuenta buscar(@PathVariable String id){
        return cuentaServicio.buscar(id);
    }

    @PutMapping("/cuenta")
    public Cuenta actualizar(@RequestBody Cuenta cuenta){
        return cuentaServicio.guardar(cuenta);
    }

    @DeleteMapping("/cuenta/{id}")
    public Boolean eliminar(@PathVariable String id){
        if(cuentaServicio.existe(id)){
            cuentaServicio.eliminar(id);
            return true;
        }else{
            return false;
        }
    }
}
