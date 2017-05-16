package com.campo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@GeneratedValue
	@Column(name = "idproducto")
	private int idproducto;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "precio")
	private int precio;
	
	@Column(name = "existencias")
	private int existencias;
	
	//Relacion Productos pedidos
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="productos")
	private Set<Pedido> pedidos = new HashSet();
	
	//Relacion Productos formatos
	@ManyToMany(cascade={CascadeType.ALL})
	@JoinTable(name="productosformatos", joinColumns={@JoinColumn(name="idproductoformato")}, inverseJoinColumns={@JoinColumn(name="idformatoproducto")})
	private Set<Formato> formatos = new HashSet();
	
	public Producto(){
		
	}

	public Producto(int idproducto, String descripcion, int precio, int existencias, Set<Pedido> pedidos) {
		super();
		this.idproducto = idproducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.existencias = existencias;
		this.pedidos = pedidos;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	
	
}
