package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.model.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {


	/*@RequestMapping(value="/index",method = RequestMethod.GET)
	public String index() {
		return "index";
	}*/
	
	// @GetMapping es un RequestMapping con metodo get 
	@GetMapping({"/index","/","/home",""})
	public String inicio(Model model) {
		model.addAttribute("titulo","Hola Spring Framework!");
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
		Usuario usuario = Usuario.builder()
				.nombre("jovan")
				.apellido("Renteria")
				.email("jdsd@sds.com")
				.build();
		List<Usuario> usuarios = new  ArrayList<>();
		modelo.addAttribute("usuarios", usuarios);
		modelo.addAttribute("titulo", "Listado Usuarios");
		return "listar";
	}

}
