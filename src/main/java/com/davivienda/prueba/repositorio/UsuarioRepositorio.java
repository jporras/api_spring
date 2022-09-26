package com.davivienda.prueba.repositorio;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davivienda.prueba.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    ArrayList<Usuario> findByNombreUsuarioAndClave(String nombreUsuario, String clave);
}