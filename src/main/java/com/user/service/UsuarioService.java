package com.user.service;

import java.util.List;

import com.user.model.Usuario;

public interface UsuarioService {
	
	public List<Usuario> userList();
	public Usuario newUser(Usuario usuario);
	public void deleteUser(Integer id);
	public void editUser(Usuario usuario);

}
