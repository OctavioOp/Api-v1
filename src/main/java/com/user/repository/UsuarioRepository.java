package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
