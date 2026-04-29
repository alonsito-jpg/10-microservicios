package com.duoc.cl.auth_service.repository;

import com.duoc.cl.auth_service.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    boolean
existsByNombreIgnoreCase(String nombre);
}
