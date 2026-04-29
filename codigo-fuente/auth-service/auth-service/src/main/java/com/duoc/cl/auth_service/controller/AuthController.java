package com.duoc.cl.auth_service.controller;

import com.duoc.cl.auth_service.model.Usuario;
import com.duoc.cl.auth_service.service.UsuarioService;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final UsuarioService usuarioService;

    public AuthController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    @PostMapping("/register")
    public Usuario registrar(@RequestBody Usuario usuario){
        return usuarioService.guardarUsuario(usuario);//Endpoint para registrar
    }

    @GetMapping("/usuarios")
    public List<Usuario> listar(){
        return usuarioService.listarTodos();//Endpoint para listar
    }
}
