package com.campo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campo.entity.Usuario;

@Repository("usuarioJpaRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable>{

	public abstract Usuario findByNombre(String nombre);
}
