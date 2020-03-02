package com.jacaranda.brenes.model.dto;

import com.jacaranda.brenes.model.Producto;

public class CarritoDTO {
	
	private Integer id;
	private Producto producto;
	private Integer cantidad;
	
	public CarritoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarritoDTO(Integer id, Producto producto, Integer cantidad) {
		super();
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
