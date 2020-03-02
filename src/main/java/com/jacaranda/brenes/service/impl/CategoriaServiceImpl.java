package com.jacaranda.brenes.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.brenes.model.Categoria;
import com.jacaranda.brenes.model.dto.CategoriaDTO;
import com.jacaranda.brenes.repository.CategoriaRepository;
import com.jacaranda.brenes.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public List<CategoriaDTO> getAll() {
		List<Categoria> categorias = categoriaRepository.findAll();
		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();
		for(Categoria cat : categorias) {
			categoriasDTO.add(new CategoriaDTO(cat.getCodCat(), cat.getNombre(), cat.getDescription(), cat.getProductos()));
		}
		return categoriasDTO;
	}

	@Override
	public CategoriaDTO getCategoriaByID(Integer id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		if(categoria.isPresent()) {
			return new CategoriaDTO(categoria.get().getCodCat() , categoria.get().getNombre(), categoria.get().getDescription(), categoria.get().getProductos());
		}else {
			return null;
		}
	}

	@Override
	public void addCategoria(CategoriaDTO categoria) {
		categoriaRepository.save(new Categoria(categoria.getNombre(), categoria.getDescription(), categoria.getProductos()));
	}

	@Override
	public void deleteCategoria(CategoriaDTO categoria) {
		categoriaRepository.delete(new Categoria(categoria.getNombre(), categoria.getDescription(), categoria.getProductos()));		
	}

}
