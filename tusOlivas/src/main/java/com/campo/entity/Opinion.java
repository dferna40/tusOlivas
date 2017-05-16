package com.campo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="opiniones")
public class Opinion {

	@Id
	@GeneratedValue
	@Column(name = "idopinion")
	private int idopinion;
	
	@Column(name = "descripcionopinion")
	private String descripcionopinion;
	
	@Column(name = "codigoopinion")
	private int codigoopinion;
	
	//Relacion muchos a uno con la tabla usuarios
	@ManyToOne
	@JoinColumn(name="idusuarioopinion")
	private Usuario usuario;
	
	public Opinion(){
		
	}

	public Opinion(int idopinion, String descripcionopinion, int codigoopinion, Usuario usuario) {
		super();
		this.idopinion = idopinion;
		this.descripcionopinion = descripcionopinion;
		this.codigoopinion = codigoopinion;
		this.usuario = usuario;
	}

	public int getIdopinion() {
		return idopinion;
	}

	public void setIdopinion(int idopinion) {
		this.idopinion = idopinion;
	}

	public String getDescripcionopinion() {
		return descripcionopinion;
	}

	public void setDescripcionopinion(String descripcionopinion) {
		this.descripcionopinion = descripcionopinion;
	}

	public int getCodigoopinion() {
		return codigoopinion;
	}

	public void setCodigoopinion(int codigoopinion) {
		this.codigoopinion = codigoopinion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
