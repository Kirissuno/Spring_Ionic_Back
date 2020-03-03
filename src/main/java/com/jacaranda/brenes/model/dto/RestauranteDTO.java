package com.jacaranda.brenes.model.dto;

import java.util.HashSet;
import java.util.Set;

import com.jacaranda.brenes.model.Pedido;

public class RestauranteDTO {
	
	private Integer codRes;
	private String correo;
	private String nombre;
	private String urlImage;
	private Integer clave;
	private String direccion;
	private Integer codPos;
	private String pais;
    private Set<Pedido> pedidos = new HashSet<>();
	public RestauranteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RestauranteDTO(Integer codRes, String correo, String nombre, String urlImage, Integer clave,
			String direccion, Integer codPos, String pais, Set<Pedido> pedidos) {
		super();
		this.codRes = codRes;
		this.correo = correo;
		this.nombre = nombre;
		this.urlImage = urlImage;
		this.clave = clave;
		this.direccion = direccion;
		this.codPos = codPos;
		this.pais = pais;
		this.pedidos = pedidos;
	}

	
	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public Integer getCodRes() {
		return codRes;
	}
	public void setCodRes(Integer codRes) {
		this.codRes = codRes;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getClave() {
		return clave;
	}
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getCodPos() {
		return codPos;
	}
	public void setCodPos(Integer codPos) {
		this.codPos = codPos;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Set<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
