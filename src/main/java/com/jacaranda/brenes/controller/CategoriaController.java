package com.jacaranda.brenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacaranda.brenes.model.dto.CategoriaDTO;
import com.jacaranda.brenes.service.CategoriaService;

@RestController
@CrossOrigin(origins = "http://localhost:8100")
@RequestMapping("/")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/categories")
	public List<CategoriaDTO> getAll(){
		return categoriaService.getAll();
	}
	
	@GetMapping("/category/{id}")
	public CategoriaDTO getCategoriaByID(@PathVariable Integer id) {
		return categoriaService.getCategoriaByID(id);
	}
	
	@PostMapping("/categories")
	public void addCategoria(@RequestBody CategoriaDTO categoria) {
		categoriaService.addCategoria(categoria);
	}
	
	@DeleteMapping("/categories")
	public void deleteCategoria(@RequestBody CategoriaDTO categoria) {
		categoriaService.deleteCategoria(categoria);
	}

}
