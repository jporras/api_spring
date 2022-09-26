package com.davivienda.prueba.servicio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.davivienda.prueba.modelo.Usuario;
import com.davivienda.prueba.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicio {
    @Autowired
    UsuarioRepositorio repositorio;

    /* 
    PasswordEncoder passwordEncoder;


    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    */

    public Usuario guardar(Usuario usuario){
        //String claveEncriptada = passwordEncoder.encode(usuario.getClave());
        //usuario.setClave(claveEncriptada);
        return repositorio.save(usuario);
    } 

    public ArrayList<Usuario> listar(){
        return (ArrayList<Usuario>)repositorio.findAll();
    }

    public Usuario buscar(String idConsulta){
        Long id = Long.parseLong(idConsulta);
        return repositorio.findById(id).orElse(new Usuario());
    } 

    public Boolean existe(String idConsulta){
        Long id = Long.parseLong(idConsulta);
        return repositorio.existsById(id);
    }

    public void eliminar(String idConsulta){
        Long id = Long.parseLong(idConsulta);
        repositorio.deleteById(id);
    } 

    public ArrayList<Usuario> ingresarUsuario(String nombreUsuario, String clave){
        //String claveEncriptada = passwordEncoder.encode(clave);
        //return repositorio.findByNombreUsuarioAndClave(nombreUsuario, claveEncriptada);
        return repositorio.findByNombreUsuarioAndClave(nombreUsuario, clave);
    }
}
