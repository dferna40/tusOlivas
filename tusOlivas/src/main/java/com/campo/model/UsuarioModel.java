package com.campo.model;

import java.time.LocalDate;

public class UsuarioModel {

	private int id;
	private String nombre;
	private String contrasena;
	private String email;
	private String documentoidentidad;
	private LocalDate fechanacimiento;
	private int telefono;

	public UsuarioModel() {

	}

	public UsuarioModel(int id, String nombre, String contrasena, String email, String documentoidentidad,
			LocalDate fechanacimiento, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.email = email;
		this.documentoidentidad = documentoidentidad;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumentoidentidad() {
		return documentoidentidad;
	}

	public void setDocumentoidentidad(String documentoidentidad) {
		this.documentoidentidad = documentoidentidad;
	}

	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
