package com.jacaranda.brenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacaranda.brenes.model.dto.UsuarioDTO;
import com.jacaranda.brenes.service.UsuarioService;

@RestController
@CrossOrigin(origins = "http://localhost:8100")
@RequestMapping("/")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public List<UsuarioDTO> getAllUsers(){
		return usuarioService.getAllUsers();
	}
	
	@GetMapping("/usuario/{usuario}")
	public UsuarioDTO getUserByUsername(@PathVariable String usuario) {
		return usuarioService.getUsuarioByUsername(usuario);
	}
	
	@PostMapping("/usuarios")
	public void addUsuario(@RequestBody UsuarioDTO usuario) {
		usuarioService.addUsuario(usuario);
	}
	
	
}
