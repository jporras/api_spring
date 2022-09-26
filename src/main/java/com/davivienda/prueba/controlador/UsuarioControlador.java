package com.davivienda.prueba.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.davivienda.prueba.modelo.Usuario;
import com.davivienda.prueba.servicio.UsuarioServicio;

//@CrossOrigin(origins = "http://localhost:8080")
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true", methods = {RequestMethod.OPTIONS, RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api")
public class UsuarioControlador {
    @Autowired
    UsuarioServicio usuarioServicio;

    @PostMapping("/usuario")
    public Usuario guardar(@RequestBody Usuario usuario){
        return usuarioServicio.guardar(usuario);
    }

    @GetMapping("/usuario")
    public ArrayList<Usuario> listar(){
        return (ArrayList<Usuario>) usuarioServicio.listar();
    }

    @GetMapping("/usuario/{id}")
    public Usuario buscar(@PathVariable String id){
        return usuarioServicio.buscar(id);
    }

    @PutMapping("/usuario")
    public Usuario actualizar(@RequestBody Usuario cuenta){
        return usuarioServicio.guardar(cuenta);
    }

    @DeleteMapping("/usuario/{id}")
    public Boolean eliminar(@PathVariable String id){
        if(usuarioServicio.existe(id)){
            usuarioServicio.eliminar(id);
            return true;
        }else{
            return false;
        }
    }

    @PostMapping("/ingreso")
    public Boolean ingresar(String nombreUsuario, String clave){
        if(usuarioServicio.ingresarUsuario(nombreUsuario, clave).size() > 0){
            return true;
        }else{
            return false;
        }
    }
}
