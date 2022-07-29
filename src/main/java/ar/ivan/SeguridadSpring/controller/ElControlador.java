package ar.ivan.SeguridadSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElControlador {
	
	@GetMapping("/")
	public String muestraInicio() {
		return "inicio";
	}
	
	
	//Agregar mapeo a administradores
	
	@GetMapping("/administradores")
	public String muestraAdministradores() {
		return "administradores";
	}
	
	//Agregar mapeo a administradores
	
	@GetMapping("/ayudantes")
	public String muestraAyudantes() {
		return "ayudantes";
	}
	
	@GetMapping("/acceso-denegado")
	public String muestraAccesoDenegado() {
		return "acceso-denegado";
	}
	

}
