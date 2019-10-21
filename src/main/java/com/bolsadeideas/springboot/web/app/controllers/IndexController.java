package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
