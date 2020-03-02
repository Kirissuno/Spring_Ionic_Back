package com.jacaranda.brenes.service;

import java.util.List;

import com.jacaranda.brenes.model.dto.CategoriaDTO;

public interface CategoriaService {

	List<CategoriaDTO> getAll();
	CategoriaDTO getCategoriaByID(Integer id);
	void addCategoria(CategoriaDTO categoria);
	void deleteCategoria(CategoriaDTO categoria);
	
}
