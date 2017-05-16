package com.campo.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.campo.entity.Usuario;
import com.campo.repository.UsuarioRepository;
import com.campo.service.UsuarioService;

@Service("usuarioServiceImpl")
public class UsuarioServiceImpl implements UsuarioService{
	
	private static final Log LOG = LogFactory.getLog(UsuarioServiceImpl.class);
	
	@Autowired
	@Qualifier("usuarioJpaRepository")
	private UsuarioRepository usuarioJpaRepository;

	@Override
	public List<Usuario> listAllUsuarios() {
		LOG.info("Call: "+ "listAllUsuarios()");
		return usuarioJpaRepository.findAll();
	}

	@Override
	public Usuario addUsuario(Usuario usuario) {
		LOG.info("Call: "+ "addUsuario()");
		return usuarioJpaRepository.save(usuario);
	}

	@Override
	public int removeUsuario(int id) {
		usuarioJpaRepository.delete(id);
		return 0;
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		return usuarioJpaRepository.save(usuario);
	}

}
