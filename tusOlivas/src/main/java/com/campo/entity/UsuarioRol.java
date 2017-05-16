package com.campo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "usuariorol", uniqueConstraints = @UniqueConstraint(
		columnNames = {"rol", "nombreusuario"}))
public class UsuarioRol {

	
	@Id
	@GeneratedValue
	@Column(name = "usuariorolid", unique = true, nullable = false)
	private Integer usuariorolid;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "nombreusuario", nullable = false)
	private Usuario usuario;
	
	@Column(name = "rol", nullable = false, length = 45)
	private String rol;
	
	public UsuarioRol(){}
	
	

	public UsuarioRol(Usuario usuario, String rol) {
		super();
		this.usuario = usuario;
		this.rol = rol;
	}



	public Integer getUsuariorolid() {
		return usuariorolid;
	}



	public void setUsuariorolid(Integer usuariorolid) {
		this.usuariorolid = usuariorolid;
	}



	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
}
