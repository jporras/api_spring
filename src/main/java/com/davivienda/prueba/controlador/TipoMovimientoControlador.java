package com.davivienda.prueba.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.davivienda.prueba.modelo.TipoMovimiento;
import com.davivienda.prueba.servicio.TipoMovimientoServicio;

@RestController
@RequestMapping("/api")
public class TipoMovimientoControlador {

    @Autowired
    TipoMovimientoServicio tipoMovimientoServicio;

    @PostMapping("/tipoMovimiento")
    public TipoMovimiento guardar(@RequestBody TipoMovimiento tipoMovimiento){
        return tipoMovimientoServicio.guardar(tipoMovimiento);
    }

    @GetMapping("/tipoMovimiento")
    public ArrayList<TipoMovimiento> listar(){
        return (ArrayList<TipoMovimiento>) tipoMovimientoServicio.listar();
    }

    @GetMapping("/tipoMovimiento/{id}")
    public TipoMovimiento buscar(@PathVariable String id){
        return tipoMovimientoServicio.buscar(id);
    }

    @PutMapping("/tipoMovimiento")
    public TipoMovimiento actualizar(@RequestBody TipoMovimiento tipoMovimiento){
        return tipoMovimientoServicio.guardar(tipoMovimiento);
    }

    @DeleteMapping("/tipoMovimiento/{id}")
    public Boolean eliminar(@PathVariable String id){
        if(tipoMovimientoServicio.existe(id)){
            tipoMovimientoServicio.eliminar(id);
            return true;
        }else{
            return false;
        }
    }
}