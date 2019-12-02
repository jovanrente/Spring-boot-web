package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.model.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {


	/*@RequestMapping(value="/index",method = RequestMethod.GET)
	public String index() {
		return "index";
	}*/
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;
	
	private String textPerfil;
	
	
	
	
	// @GetMapping es un RequestMapping con metodo get 
	@GetMapping({"/index","/","/home",""})
	public String inicio(Model model) {
		model.addAttribute("titulo",textoIndex);
		return "index";
	}
	
	@GetMapping("/perfil")
	public String perfil(Model modelo) {
		Usuario usuario = Usuario.builder()
				.nombre("jovan")
				.apellido("Renteria")
				.email("jdsd@sds.com")
				.build();
		modelo.addAttribute("usuario", usuario);
		return "perfil";
	}
	
	@GetMapping("/listar")
	public String listar(Model modelo) {
		//modelo.addAttribute("usuarios", usuarios);
		modelo.addAttribute("titulo", textoListar);
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> listaUsers(){
		List<Usuario> usuarios = Arrays.asList(Usuario.builder().nombre("jose").apellido("tale").email("sas@sds.com").build(),
				Usuario.builder().nombre("maria").apellido("asa").email("sas@sds.com").build(), Usuario.builder().nombre("diana").apellido("tale").email("sas@sds.com").build());
		return usuarios;
	}

}
