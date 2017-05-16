package com.campo.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.campo.entity.Usuario;
import com.campo.entity.UsuarioRol;
import com.campo.repository.UsuarioRepository;

@Service("usuarioServiceSecurity")
public class UsuarioServiceSecurity implements UserDetailsService{
	
	@Autowired
	@Qualifier("usuarioJpaRepository")
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
		com.campo.entity.Usuario usuario = usuarioRepository.findByNombre(nombreUsuario);
		List<GrantedAuthority> authorities = buildAuthorities(usuario.getUsuarioRol());
		return (UserDetails) buildUsuario(usuario,authorities);
	}
	
	private Usuario buildUsuario(com.campo.entity.Usuario usuario, List<GrantedAuthority> authorities){
		return new Usuario(usuario.getNombre(), usuario.getContrasena(), usuario.getEmail(), usuario.getDocumentoidentidad(), usuario.getFechanacimiento(), usuario.getTelefono(), usuario.getUsuarioRol(), authorities);
	}
	
	private List<GrantedAuthority> buildAuthorities(Set<UsuarioRol> usuarioRoles){
		Set<GrantedAuthority> auths = new HashSet<GrantedAuthority>();
		
		for(UsuarioRol usuarioRol : usuarioRoles){
			auths.add(new SimpleGrantedAuthority(usuarioRol.getRol()));
		}
		return new ArrayList<GrantedAuthority>(auths);
		
	}

}
