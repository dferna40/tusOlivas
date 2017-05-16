package com.campo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="formatos")
public class Formato {

	@Id
	@GeneratedValue
	@Column(name = "idformato")
	private int idformato;
	
	@Column(name = "codigoformato")
	private int codigoformato;
	
	@Column(name = "nombreformato")
	private String nombreformato;
	
	@Column(name = "descripcionformato")
	private String descripcionformato;
	
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="formatos")
	private Set<Producto> productos = new HashSet();

	public Formato() {
	}

	public Formato(int idformato, int codigoformato, String nombreformato, String descripcionformato,
			Set<Producto> productos) {
		super();
		this.idformato = idformato;
		this.codigoformato = codigoformato;
		this.nombreformato = nombreformato;
		this.descripcionformato = descripcionformato;
		this.productos = productos;
	}

	public int getIdformato() {
		return idformato;
	}

	public void setIdformato(int idformato) {
		this.idformato = idformato;
	}

	public int getCodigoformato() {
		return codigoformato;
	}

	public void setCodigoformato(int codigoformato) {
		this.codigoformato = codigoformato;
	}

	public String getNombreformato() {
		return nombreformato;
	}

	public void setNombreformato(String nombreformato) {
		this.nombreformato = nombreformato;
	}

	public String getDescripcionformato() {
		return descripcionformato;
	}

	public void setDescripcionformato(String descripcionformato) {
		this.descripcionformato = descripcionformato;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
	
	
}
