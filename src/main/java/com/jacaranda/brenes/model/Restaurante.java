package com.jacaranda.brenes.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="restaurante")
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codRes;
	private Integer correo;
	private Integer clave;
	private String direccion;
	private Integer codPos;
	private String pais;

	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "res_pedidos",
            joinColumns = { @JoinColumn(name = "restaurante_id") },
            inverseJoinColumns = { @JoinColumn(name = "pedido_id") })
    private Set<Pedido> pedidos = new HashSet<>();
	
	public Restaurante() {
		super();
	}

	public Restaurante(Integer correo, Integer clave, String direccion, Integer codPos, String pais,
			Set<Pedido> pedidos) {
		super();
		this.correo = correo;
		this.clave = clave;
		this.direccion = direccion;
		this.codPos = codPos;
		this.pais = pais;
		this.pedidos = pedidos;
	}

	public Integer getCodRes() {
		return codRes;
	}

	public Integer getCorreo() {
		return correo;
	}

	public void setCorreo(Integer correo) {
		this.correo = correo;
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
