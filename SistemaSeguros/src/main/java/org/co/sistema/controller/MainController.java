package org.co.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "home";
	}

	@RequestMapping("/aseguradoras")
	public String aseguradoras() {
		return "maestros/aseguradoras/listar";
	}

	@RequestMapping("/clientes")
	public String clientes() {
		return "maestros/clientes/listar";
	}

	@RequestMapping("/tiposautomotor")
	public String tiposautomotor() {
		return "maestros/tiposautomotor/listar";
	}

	@RequestMapping("/tipospago")
	public String tipospago() {
		return "maestros/tipospago/listar";
	}

	@RequestMapping("/automotores")
	public String automotores() {
		return "procesos/automotores/listar";
	}

}
