package com.jacaranda.brenes.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.brenes.model.Carrito;
import com.jacaranda.brenes.model.Producto;
import com.jacaranda.brenes.model.dto.ProductoDTO;
import com.jacaranda.brenes.repository.CarritoRepository;
import com.jacaranda.brenes.service.CarritoService;

@Service
public class CarritoServiceImpl implements CarritoService {
	@Autowired
	private CarritoRepository carritoRepo;

	Carrito carrito = new Carrito();
	
	@Override
	public void addProducto(ProductoDTO prod) {		
		carrito.getProductos().add(new Producto(prod.getNombre(), prod.getDescription(), prod.getPeso(), prod.getStock(), prod.getPedidos(), prod.getCategorias()));
		carritoRepo.save(carrito);
	}

	@Override
	public void deleteProducto(Integer id) {
		for (Producto producto : carrito.getProductos()) {
			if(producto.getCodProd() == id) {
				carrito.getProductos().remove(producto);
			}
		}
		carritoRepo.save(carrito);
	}

	@Override
	public Integer getCantidadByProdID(Integer prodID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCarrito() {
		carrito = new Carrito();
	}

	@Override
	public Set<ProductoDTO> getAllProducts() {
		return null;
	}

	
	
}
