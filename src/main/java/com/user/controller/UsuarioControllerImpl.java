package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Usuario;
import com.user.service.UsuarioService;


@RestController
@RequestMapping("user/v1/api")
public class UsuarioControllerImpl implements UsuarioController{
	
	@Autowired
	UsuarioService us;

	@Override
	@GetMapping("/list")
	@ResponseStatus(HttpStatus.OK)
	public List<Usuario> UserList() {
		// TODO Auto-generated method stub
		return us.userList();
	}

	@Override
	@PostMapping("/new")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Usuario newUser(@RequestBody Usuario usuario) {
		// TODO Auto-generated method stub
		return us.newUser(usuario);
	}

	@Override
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteUser(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		us.deleteUser(id);
	}

	@Override
	@PutMapping("/edit")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void editUser(@RequestBody Usuario usuario) {
		// TODO Auto-generated method stub
		us.editUser(usuario);
	}
	

}
