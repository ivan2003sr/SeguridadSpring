package ar.ivan.SeguridadSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorLoginPropio {
	
	@GetMapping("/miFormularioLogin")
	public String muestraLoginPropio() {
		return "login-propio";
	}

}
