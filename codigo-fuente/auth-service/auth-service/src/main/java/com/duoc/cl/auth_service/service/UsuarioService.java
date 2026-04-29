package com.duoc.cl.auth_service.service;

import com.duoc.cl.auth_service.model.Usuario;
import com.duoc.cl.auth_service.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);//logica para crear y registrar
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();//Logica para obtener todos
    }

}
