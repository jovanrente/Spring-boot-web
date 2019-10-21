package com.bolsadeideas.springboot.web.app.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class Usuario {
	private String nombre;
	private String apellido;
	private String email;

}
