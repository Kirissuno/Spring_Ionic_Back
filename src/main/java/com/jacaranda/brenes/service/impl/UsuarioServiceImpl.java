package com.jacaranda.brenes.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.brenes.model.Usuario;
import com.jacaranda.brenes.model.dto.UsuarioDTO;
import com.jacaranda.brenes.repository.UsuarioRepository;
import com.jacaranda.brenes.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void addUsuario(UsuarioDTO usuario) {
		usuarioRepository.save(new Usuario(usuario.getUsuario(), usuario.getContrasena()));		
	}

	@Override
	public UsuarioDTO getUsuarioByUsername(String usuario) {
		Optional<Usuario> usuarioBD = usuarioRepository.findById(usuario);
		if(usuarioBD.isPresent()) {
			return new UsuarioDTO(usuarioBD.get().getUsuario(), usuarioBD.get().getContrasena());
		}else {
			return null;
		}
	}

	@Override
	public List<UsuarioDTO> getAllUsers() {
		List<Usuario> usuariosBD = usuarioRepository.findAll();
		List<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();
		for(Usuario usuario : usuariosBD) {
			usuarios.add(new UsuarioDTO(usuario.getUsuario(), usuario.getContrasena()));
		}
		return usuarios;
	}

}
