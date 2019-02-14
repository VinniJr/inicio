package com.inicio.inicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inicio.inicio.model.Perfil;
import com.inicio.inicio.model.Usuario;
import com.inicio.inicio.service.PerfilService;
import com.inicio.inicio.service.UsuarioService;

@Controller
public class CadastroController {
	
	@Autowired
	private UsuarioService service;
	
	@Autowired
	private PerfilService perfilService;
	
	@GetMapping("/")
	public ModelAndView findAll(Usuario user) {
		
		ModelAndView mv = new ModelAndView("/login");
		mv.addObject("usuario", user);
		
		return mv;
	}
	
	@GetMapping("/logar")
	public ModelAndView logar(Usuario user) {
		Usuario usu = service.buscarClientePorCPF(user.getCpf());
		Perfil pf = perfilService.perfilUsuario(usu.getCpf());
		ModelAndView mv = new ModelAndView();
		
		if("adm".equalsIgnoreCase(pf.getDescPerfil())) {
			mv = new ModelAndView("/cadastro");
			mv.addObject("usuario", usu );
			mv.addObject("perfil", pf );
		}else {
			mv = new ModelAndView("/comum");
			mv.addObject("usuario", usu );
		}
		
		return mv;
	}
	
	

}
