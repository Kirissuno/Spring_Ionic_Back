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

import com.jacaranda.brenes.model.dto.ProductoDTO;
import com.jacaranda.brenes.service.ProductoService;

@RestController
@CrossOrigin(origins = "http://localhost:8100")
@RequestMapping("/")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/products")
	public List<ProductoDTO> getAll(){
		return productoService.getAll();
	}
	
	@GetMapping("/product/{id}")
	public ProductoDTO getProductoByID(@PathVariable Integer id) {
		return productoService.getProductoByID(id);
	}
	
	@PostMapping("/products")
	public void addProducto(@RequestBody ProductoDTO producto) {
		productoService.addProducto(producto);
	}
	
	@DeleteMapping("/products")
	public void deleteProducto(@RequestBody ProductoDTO producto) {
		productoService.deleteProducto(producto);
	}

}
