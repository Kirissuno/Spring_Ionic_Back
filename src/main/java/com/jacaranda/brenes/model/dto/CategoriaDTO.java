package com.jacaranda.brenes.model.dto;

import java.util.HashSet;
import java.util.Set;

import com.jacaranda.brenes.model.Producto;

public class CategoriaDTO {
	
	private Integer codCat;
	private String nombre;
	private String description;
    private Set<Producto> productos = new HashSet<>();
	public CategoriaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoriaDTO(Integer codCat, String nombre, String description, Set<Producto> productos) {
		super();
		this.codCat = codCat;
		this.nombre = nombre;
		this.description = description;
		this.productos = productos;
	}
	public Integer getCodCat() {
		return codCat;
	}
	public void setCodCat(Integer codCat) {
		this.codCat = codCat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

}
