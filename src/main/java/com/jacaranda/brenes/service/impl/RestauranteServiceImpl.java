package com.jacaranda.brenes.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.brenes.model.Restaurante;
import com.jacaranda.brenes.model.dto.RestauranteDTO;
import com.jacaranda.brenes.repository.RestauranteRepository;
import com.jacaranda.brenes.service.RestauranteService;

@Service
public class RestauranteServiceImpl implements RestauranteService {
	
	@Autowired
	private RestauranteRepository restauranteRepository;

	@Override
	public List<RestauranteDTO> getAll() {
		List<Restaurante> restaurantes = restauranteRepository.findAll();
		List<RestauranteDTO> restaurantesDTO = new ArrayList<RestauranteDTO>();
		for(Restaurante cat : restaurantes) {
			restaurantesDTO.add(new RestauranteDTO(cat.getCodRes(), cat.getCorreo(), cat.getClave(), cat.getDireccion(), cat.getCodPos(), cat.getPais(), cat.getPedidos()));
		}
		return restaurantesDTO;
	}

	@Override
	public RestauranteDTO getRestauranteByID(Integer id) {
		Optional<Restaurante> restaurante = restauranteRepository.findById(id);
		if(restaurante.isPresent()) {
			return new RestauranteDTO(restaurante.get().getCodRes() , restaurante.get().getCorreo(), restaurante.get().getClave(), restaurante.get().getDireccion(), restaurante.get().getCodPos(), restaurante.get().getPais(), restaurante.get().getPedidos());
		}else {
			return null;
		}
	}

	@Override
	public void addRestaurante(RestauranteDTO restaurante) {
		restauranteRepository.save(new Restaurante(restaurante.getCorreo(), restaurante.getClave(), restaurante.getDireccion(), restaurante.getCodPos(), restaurante.getPais(), restaurante.getPedidos()));
	}

	@Override
	public void deleteRestaurante(RestauranteDTO restaurante) {
		restauranteRepository.delete(new Restaurante(restaurante.getCorreo(), restaurante.getClave(), restaurante.getDireccion(), restaurante.getCodPos(), restaurante.getPais(), restaurante.getPedidos()));
	}


}
