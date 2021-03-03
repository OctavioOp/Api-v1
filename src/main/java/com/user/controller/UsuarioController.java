package com.user.controller;

import java.util.List;

import com.user.model.Usuario;

public interface UsuarioController {
	public List<Usuario> UserList();
	public Usuario newUser(Usuario usuario);
	public void deleteUser(Integer id);
	public void editUser(Usuario usuario);
}
