package com.jacaranda.brenes.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.brenes.model.Producto;
import com.jacaranda.brenes.model.dto.ProductoDTO;
import com.jacaranda.brenes.repository.ProductoRepository;
import com.jacaranda.brenes.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<ProductoDTO> getAll() {
		List<Producto> productos = productoRepository.findAll();
		List<ProductoDTO> productosDTO = new ArrayList<ProductoDTO>();
		for(Producto cat : productos) {
			productosDTO.add(new ProductoDTO(cat.getCodProd(), cat.getNombre(), cat.getDescription(), cat.getUrlImage(), cat.getPeso(),cat.getStock(), cat.getPedidos(), cat.getCategorias()));
		}
		return productosDTO;
	}

	@Override
	public ProductoDTO getProductoByID(Integer id) {
		Optional<Producto> producto = productoRepository.findById(id);
		if(producto.isPresent()) {
			return new ProductoDTO(producto.get().getCodProd() , producto.get().getNombre(), producto.get().getDescription(), producto.get().getUrlImage(), producto.get().getPeso(), producto.get().getStock(), producto.get().getPedidos(), producto.get().getCategorias());
		}else {
			return null;
		}
	}

	@Override
	public void addProducto(ProductoDTO producto) {
		productoRepository.save(new Producto(producto.getNombre(), producto.getDescription(), producto.getUrlImage(), producto.getPeso(), producto.getStock(), producto.getPedidos(), producto.getCategorias()));
	}

	@Override
	public void deleteProducto(ProductoDTO producto) {
		productoRepository.delete(new Producto(producto.getNombre(), producto.getDescription(), producto.getUrlImage(), producto.getPeso(), producto.getStock(), producto.getPedidos(), producto.getCategorias()));
	}

}
