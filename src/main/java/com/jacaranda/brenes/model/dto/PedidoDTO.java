package com.jacaranda.brenes.model.dto;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.jacaranda.brenes.model.Producto;
import com.jacaranda.brenes.model.Restaurante;

public class PedidoDTO {
	
	private Integer codPed;
	private Date fecha;
	private Date fechaEnvio;
    private Set<Restaurante> restaurantes = new HashSet<>();
    private Set<Producto> productos = new HashSet<>();
	public PedidoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PedidoDTO(Integer codPed, Date fecha, Date fechaEnvio, Set<Restaurante> restaurantes,
			Set<Producto> productos) {
		super();
		this.codPed = codPed;
		this.fecha = fecha;
		this.fechaEnvio = fechaEnvio;
		this.restaurantes = restaurantes;
		this.productos = productos;
	}
	public Integer getCodPed() {
		return codPed;
	}
	public void setCodPed(Integer codPed) {
		this.codPed = codPed;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getFechaEnvio() {
		return fechaEnvio;
	}
	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	public Set<Restaurante> getRestaurantes() {
		return restaurantes;
	}
	public void setRestaurantes(Set<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

}
