package com.campo.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "contrasena")
	private String contrasena;

	@Column(name = "email")
	private String email;

	@Column(name = "documentoidentidad")
	private String documentoidentidad;

	@Column(name = "fechanacimiento")
	private LocalDate fechanacimiento;

	@Column(name = "telefono")
	private int telefono;

	@OneToMany(fetch = FetchType.EAGER, mappedBy= "usuario")
	private Set<UsuarioRol> usuarioRol = new HashSet<UsuarioRol>();

	@OneToMany
	@JoinColumn(name = "idusuarioopinion")
	private List<Opinion> opiniones;

	@OneToMany
	@JoinColumn(name = "idusuariopedido")
	private List<Pedido> pedidos;

	@OneToMany
	@JoinColumn(name = "idusuariodireccion")
	private List<Direccion> direcciones;

	public Usuario() {

	}

	public Usuario(int id, String nombre, String contrasena, String email, String documentoidentidad,
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

	public Usuario(int id, String nombre, String contrasena, String email, String documentoidentidad,
			LocalDate fechanacimiento, int telefono, Set<UsuarioRol> usuarioRol, List<Opinion> opiniones,
			List<Pedido> pedidos, List<Direccion> direcciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.email = email;
		this.documentoidentidad = documentoidentidad;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		this.usuarioRol = usuarioRol;
		this.opiniones = opiniones;
		this.pedidos = pedidos;
		this.direcciones = direcciones;
	}
	
	

	public Usuario(String nombre, String contrasena, String email, String documentoidentidad, LocalDate fechanacimiento,
			int telefono, Set<UsuarioRol> usuarioRol, List<GrantedAuthority> authorities) {
		super();
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.email = email;
		this.documentoidentidad = documentoidentidad;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		this.usuarioRol = usuarioRol;
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

	public List<Opinion> getOpiniones() {
		return opiniones;
	}

	public void setOpiniones(List<Opinion> opiniones) {
		this.opiniones = opiniones;
	}
	
	

	public Set<UsuarioRol> getUsuarioRol() {
		return usuarioRol;
	}

	public void setUsuarioRol(Set<UsuarioRol> usuarioRol) {
		this.usuarioRol = usuarioRol;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", contrasena=" + contrasena + ", email=" + email
				+ ", documentoidentidad=" + documentoidentidad + ", fechanacimiento=" + fechanacimiento + ", telefono="
				+ telefono + "]";
	}

}
