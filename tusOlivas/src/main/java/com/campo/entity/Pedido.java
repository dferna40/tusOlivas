package com.campo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="pedidos")
public class Pedido {

	@Id
	@GeneratedValue
	@Column(name = "idpedido")
	private int idpedido;
	
	@Column(name = "fechapedido")
	private LocalDateTime fechapedido;
	
	@Column(name = "estadopedido")
	private String estadopedido;
	
	@Column(name = "numpedido")
	private int numpedido;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "importe")
	private int importe;
	
	//Relacion Pedidos usuarios
	@ManyToOne
	@JoinColumn(name="idusuariopedido")
	private Usuario usuario;
	
	//Relacion Pedidos productos
	@ManyToMany(cascade={CascadeType.ALL})
	@JoinTable(name="pedidosproductos", joinColumns={@JoinColumn(name="idpedidoproducto")}, inverseJoinColumns={@JoinColumn(name="idproductopedido")})
	private Set<Producto> productos = new HashSet();
	
	public Pedido(){
		
	}

	public Pedido(int idpedido, LocalDateTime fechapedido, String estadopedido, int numpedido, int cantidad,
			int importe, Usuario usuario, Set<Producto> productos) {
		super();
		this.idpedido = idpedido;
		this.fechapedido = fechapedido;
		this.estadopedido = estadopedido;
		this.numpedido = numpedido;
		this.cantidad = cantidad;
		this.importe = importe;
		this.usuario = usuario;
		this.productos = productos;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public LocalDateTime getFechapedido() {
		return fechapedido;
	}

	public void setFechapedido(LocalDateTime fechapedido) {
		this.fechapedido = fechapedido;
	}

	public String getEstadopedido() {
		return estadopedido;
	}

	public void setEstadopedido(String estadopedido) {
		this.estadopedido = estadopedido;
	}

	public int getNumpedido() {
		return numpedido;
	}

	public void setNumpedido(int numpedido) {
		this.numpedido = numpedido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
	
	
}
