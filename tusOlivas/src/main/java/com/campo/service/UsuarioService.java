package com.campo.service;

import java.util.List;

import com.campo.entity.Usuario;

public interface UsuarioService {

	public abstract List<Usuario> listAllUsuarios();
	public abstract Usuario addUsuario(Usuario usuario);
	public abstract int removeUsuario(int id);
	public abstract Usuario updateUsuario(Usuario usuario);
}
