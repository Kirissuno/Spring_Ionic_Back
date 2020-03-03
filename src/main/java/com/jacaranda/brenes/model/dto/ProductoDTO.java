package com.jacaranda.brenes.model.dto;

import java.util.HashSet;
import java.util.Set;

import com.jacaranda.brenes.model.Categoria;
import com.jacaranda.brenes.model.Pedido;

public class ProductoDTO {
	
	private Integer codProd;
	private String nombre;
	private String description;
	private String urlImage;
	private Double peso;
	private Integer stock;
    private Set<Pedido> pedidos = new HashSet<>();
    private Set<Categoria> categorias = new HashSet<>();
	public ProductoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductoDTO(Integer codProd, String nombre, String description, String urlImage, Double peso, Integer stock,
			Set<Pedido> pedidos, Set<Categoria> categorias) {
		super();
		this.codProd = codProd;
		this.nombre = nombre;
		this.urlImage = urlImage;
		this.description = description;
		this.peso = peso;
		this.stock = stock;
		this.pedidos = pedidos;
		this.categorias = categorias;
	}
	
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public Integer getCodProd() {
		return codProd;
	}
	public void setCodProd(Integer codProd) {
		this.codProd = codProd;
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
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Set<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public Set<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}

}
