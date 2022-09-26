package com.davivienda.prueba.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.davivienda.prueba.modelo.Movimiento;
import com.davivienda.prueba.servicio.MovimientoServicio;

@RestController
@RequestMapping("/api")
public class MovimientoControlador {

    @Autowired
    MovimientoServicio movimientoServicio;

    @PostMapping("/movimiento")
    public Movimiento guardar(@RequestBody Movimiento movimiento){
        return movimientoServicio.guardar(movimiento);
    }

    @GetMapping("/movimiento")
    public ArrayList<Movimiento> listar(){
        return (ArrayList<Movimiento>) movimientoServicio.listar();
    }

    @GetMapping("/movimiento/{id}")
    public Movimiento buscar(@PathVariable String id){
        return movimientoServicio.buscar(id);
    }

    @PutMapping("/movimiento")
    public Movimiento actualizar(@RequestBody Movimiento movimiento){
        return movimientoServicio.guardar(movimiento);
    }

    @DeleteMapping("/movimiento/{id}")
    public Boolean eliminar(@PathVariable String id){
        if(movimientoServicio.existe(id)){
            movimientoServicio.eliminar(id);
            return true;
        }else{
            return false;
        }
    }
}