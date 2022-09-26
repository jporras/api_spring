package com.davivienda.prueba;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

import com.davivienda.prueba.modelo.Usuario;
import com.davivienda.prueba.repositorio.UsuarioRepositorio;
import com.davivienda.prueba.servicio.UsuarioServicio;

@SpringBootTest
class UsuarioPrueba {

    @Mock
    UsuarioRepositorio usuarioRepositorio;

    @InjectMocks
    UsuarioServicio usuarioServicio;

    @Test
    public void buscarUsuario(){
        Usuario item = usuarioServicio.buscar("1");
        assertThat(item).hasSameClassAs(new Usuario());
    }
    
}
