package com.davivienda.prueba.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.davivienda.prueba.modelo.Compra;
import com.davivienda.prueba.servicio.CompraServicio;

@RestController
@RequestMapping("/api")
public class CompraControlador {

    @Autowired
    CompraServicio compraServicio;

    @PostMapping("/compra")
    public Compra guardar(@RequestBody Compra compra){
        return compraServicio.guardar(compra);
    }

    @GetMapping("/compra")
    public ArrayList<Compra> listar(){
        return (ArrayList<Compra>) compraServicio.listar();
    }

    @GetMapping("/compra/{id}")
    public Compra buscar(@PathVariable String id){
        return compraServicio.buscar(id);
    }

    @PutMapping("/compra")
    public Compra actualizar(@RequestBody Compra compra){
        return compraServicio.guardar(compra);
    }

    @DeleteMapping("/compra/{id}")
    public Boolean eliminar(@PathVariable String id){
        if(compraServicio.existe(id)){
            compraServicio.eliminar(id);
            return true;
        }else{
            return false;
        }
    }
}