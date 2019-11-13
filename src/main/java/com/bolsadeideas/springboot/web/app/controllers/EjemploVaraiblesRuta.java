package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVaraiblesRuta {
	
	@GetMapping("/")
	public String index() {
		return "variables/index";
	}
	@GetMapping("/string/{texto}/{numero}")
	public String vaiables(@PathVariable String texto, @PathVariable Integer numero, Model model) {
		model.addAttribute("titulo", "Recibir parametros del la ruta (@PathVariable)");
		model.addAttribute("resultado", "El texto enviado fue :"+texto+" El  umero enviado es : "+numero);
		return "variables/ver";
	}
	
	@GetMapping("/string/{texto}")
	public String vaiables(@PathVariable String texto, Model model) {
		model.addAttribute("titulo", "Recibir parametros del la ruta (@PathVariable)");
		model.addAttribute("resultado", "El texto enviado fue :"+texto);
		return "variables/ver";
	}
}
