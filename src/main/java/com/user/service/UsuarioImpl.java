package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.Usuario;
import com.user.repository.UsuarioRepository;

@Service
public class UsuarioImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository ur;
	
	@Override
	public List<Usuario> userList() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	public Usuario newUser(Usuario usuario) {
		// TODO Auto-generated method stub
		if(usuario != null) {
			ur.save(usuario);
		}
		return new Usuario();
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		if(ur.existsById(id)) {
			ur.deleteById(id);
		}
		
	}

	@Override
	public void editUser(Usuario usuario) {
		// TODO Auto-generated method stub
		Integer id = usuario.getId();
		
		
		if(ur.existsById(id)) {
			Usuario update = new Usuario();
			update.setId(usuario.getId());
			update.setNombre(usuario.getNombre());
			update.setApellido(usuario.getApellido());
			update.setNickname(usuario.getNickname());
			update.setCorreo(usuario.getCorreo());
			update.setClave(usuario.getClave());
			
			ur.save(update);
		}
		
	}

}
