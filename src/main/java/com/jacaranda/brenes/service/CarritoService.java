package com.jacaranda.brenes.service;

import java.util.Set;

import com.jacaranda.brenes.model.dto.ProductoDTO;

public interface CarritoService {
	
	void addProducto(ProductoDTO prod);
	void deleteProducto(Integer id);
	Integer getCantidadByProdID(Integer prodID);
	void deleteCarrito();
	Set<ProductoDTO> getAllProducts();

}
