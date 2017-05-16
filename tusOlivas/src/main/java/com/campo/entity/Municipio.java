package com.campo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="municipios")
public class Municipio {
	
	@Id
	@GeneratedValue
	@Column(name = "idmunicipio")
	private int idmunicipio;
	
	@Column(name = "codmunicipio")
	private int codmunicipio;
	
	@Column(name = "dc")
	private int dc;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="idmunicipiodireccion")
	private List<Direccion> direcciones;
	
	@ManyToOne
	@JoinColumn(name="idprovinciamunicipio")
	private Provincia provincia;
	
	public Municipio(){
		
	}

	public Municipio(int idmunicipio, int codmunicipio, int dc, String nombre, List<Direccion> direcciones) {
		super();
		this.idmunicipio = idmunicipio;
		this.codmunicipio = codmunicipio;
		this.dc = dc;
		this.nombre = nombre;
		this.direcciones = direcciones;
	}

	public int getIdmunicipio() {
		return idmunicipio;
	}

	public void setIdmunicipio(int idmunicipio) {
		this.idmunicipio = idmunicipio;
	}

	public int getCodmunicipio() {
		return codmunicipio;
	}

	public void setCodmunicipio(int codmunicipio) {
		this.codmunicipio = codmunicipio;
	}

	public int getDc() {
		return dc;
	}

	public void setDc(int dc) {
		this.dc = dc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	
	

}
