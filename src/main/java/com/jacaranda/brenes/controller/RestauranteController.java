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

import com.jacaranda.brenes.model.dto.RestauranteDTO;
import com.jacaranda.brenes.service.RestauranteService;

@RestController
@CrossOrigin(origins = "http://localhost:8100")
@RequestMapping("/")
public class RestauranteController {
	
	@Autowired
	private RestauranteService restauranteService;
	
	@GetMapping("/restaurants")
	public List<RestauranteDTO> getAll(){
		return restauranteService.getAll();
	}
	
	@GetMapping("/restaurant/{id}")
	public RestauranteDTO getRestauranteByID(@PathVariable Integer id) {
		return restauranteService.getRestauranteByID(id);
	}
	
	@PostMapping("/restaurants")
	public void addRestaurante(@RequestBody RestauranteDTO restaurante) {
		restauranteService.addRestaurante(restaurante);
	}
	
	@DeleteMapping("/restaurants")
	public void deleteRestaurante(@RequestBody RestauranteDTO restaurante) {
		restauranteService.deleteRestaurante(restaurante);
	}
	

}
