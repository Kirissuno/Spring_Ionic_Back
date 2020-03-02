package com.jacaranda.brenes.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "carrito")
public class Carrito {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "carrito")
	private Set<Producto> productos;
	
	private Integer cantidad;
	
	public Carrito() {
		super();
	}
	public Carrito(Set<Producto> producto, Integer cantidad) {
		super();
		this.productos = producto;
		this.cantidad = cantidad;
	}
	public Integer getId() {
		return id;
	}
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}	
}