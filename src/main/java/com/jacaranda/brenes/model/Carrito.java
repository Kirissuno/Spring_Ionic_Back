package com.jacaranda.brenes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carrito")
public class Carrito {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String producto;
	private Integer cantidad;
	
	public Carrito() {
		super();
	}
	public Carrito(String producto, Integer cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Integer getId() {
		return id;
	}
	public String getProductos() {
		return producto;
	}
	public void setProductos(String producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}	
}