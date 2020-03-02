package com.jacaranda.brenes.service;

import java.util.List;

import com.jacaranda.brenes.model.dto.UsuarioDTO;

public interface UsuarioService {
	
	void addUsuario(UsuarioDTO usuario);
	UsuarioDTO getUsuarioByUsername(String usuario);
	List<UsuarioDTO> getAllUsers();

}
