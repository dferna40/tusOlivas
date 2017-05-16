package com.campo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="direcciones")
public class Direccion {

	@Id
	@GeneratedValue
	@Column(name = "iddireccion")
	private int iddireccion;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "direccionpostal")
	private String direccionpostal;
	
	@Column(name = "codigopostal")
	private int codigopostal;
	
	@Column(name = "telefono")
	private int telefono;
	
	//Relacion muchos a uno con la tabla usuarios
	@ManyToOne
	@JoinColumn(name="idusuariodireccion")
	private Usuario usuario;
		
	@ManyToOne
	@JoinColumn(name="idprovinciadireccion")
	private Provincia provincia;
	
	@ManyToOne
	@JoinColumn(name="idmunicipiodireccion")
	private Municipio municipio;
}
