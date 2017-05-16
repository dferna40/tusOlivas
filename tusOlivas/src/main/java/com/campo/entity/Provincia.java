package com.campo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="provincias")
public class Provincia {

	@Id
	@GeneratedValue
	@Column(name = "idprovincia")
	private int idprovincia;
	
	@Column(name = "provincia")
	private String provincia;
	
	@OneToMany
	@JoinColumn(name="idprovinciadireccion")
	private List<Direccion> direcciones;
	
	@OneToMany
	@JoinColumn(name="idprovinciamunicipio")
	private List<Municipio> municipios;
	
	public Provincia(){
		
	}

	public Provincia(int idprovincia, String provincia, List<Direccion> direcciones) {
		super();
		this.idprovincia = idprovincia;
		this.provincia = provincia;
		this.direcciones = direcciones;
	}

	public int getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	
	
}
