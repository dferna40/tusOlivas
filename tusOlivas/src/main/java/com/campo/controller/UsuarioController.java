package com.campo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.campo.entity.Usuario;
import com.campo.service.UsuarioService;


@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	public static final String USUARIOS_VIEW = "usuarios";
	
	private static final Log LOG = LogFactory.getLog(UsuarioController.class);
	
	@Autowired
	@Qualifier("usuarioServiceImpl")
	private UsuarioService usuarioService;

	@GetMapping("/listusuarios")
	public ModelAndView listAllUsuarios(){
		LOG.info("Call: "+"listAllUsuarios()");
		ModelAndView mav = new ModelAndView(USUARIOS_VIEW);
		mav.addObject("usuarios", usuarioService.listAllUsuarios());
		return mav;
	}
	
	@PostMapping("/addusuario")
	public String addCourse(@ModelAttribute("usuario") Usuario usuario){
		LOG.info("Call: "+"addUsuario()"+ " -- Param: "+ usuario.toString());
		usuarioService.addUsuario(usuario);
		return "redirect:/usuarios/listusuarios";
	}
}
