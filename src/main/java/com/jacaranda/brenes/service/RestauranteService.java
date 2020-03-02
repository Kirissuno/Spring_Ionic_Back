package com.jacaranda.brenes.service;

import java.util.List;

import com.jacaranda.brenes.model.dto.RestauranteDTO;

public interface RestauranteService {

	List<RestauranteDTO> getAll();
	RestauranteDTO getRestauranteByID(Integer id);
	void addRestaurante(RestauranteDTO restaurante);
	void deleteRestaurante(RestauranteDTO restaurante);
	
}
