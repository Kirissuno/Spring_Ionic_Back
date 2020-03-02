package com.jacaranda.brenes.service;

import java.util.List;

import com.jacaranda.brenes.model.dto.ProductoDTO;

public interface ProductoService {
	
	List<ProductoDTO> getAll();
	ProductoDTO getProductoByID(Integer id);
	void addProducto(ProductoDTO producto);
	void deleteProducto(ProductoDTO producto);

}
