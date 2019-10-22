package com.bolsadeideas.springboot.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjmeploParamsController {
	
	
	@GetMapping("/")
	public String index() {
		return "params/index";
	}

	@GetMapping("/string")
	public String param(@RequestParam(required = false, defaultValue = "valor por default") String texto, Model model) {
		model.addAttribute("resultado","el parametro enviado es :"+texto);
		return "params/ver";
	}
	
	@GetMapping("/mix-param")
	public String param(@RequestParam String saludo,@RequestParam Integer numero, Model model) {
		model.addAttribute("resultado","el saludo enviado es  : '"+saludo+"' y el nuemro es :'"+numero+"'");
		return "params/ver";
	}
	
	@GetMapping("/mix-paramRequest")
	public String param(HttpServletRequest reuest , Model model) {
		String saludo = reuest.getParameter("saludo");
		Integer numero = Integer.parseInt(reuest.getParameter("numero"));
		model.addAttribute("resultado","el saludo enviado es  : '"+saludo+"' y el nuemro es :'"+numero+"'");
		return "params/ver";
	}
}
