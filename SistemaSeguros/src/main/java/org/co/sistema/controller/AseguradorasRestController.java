package org.co.sistema.controller;

import java.util.List;

import org.co.sistema.model.Aseguradoras;
import org.co.sistema.service.AseguradorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class AseguradorasRestController {

	@Autowired
	private AseguradorasService aseguradorasService;

	@GetMapping(value = "/hello")
	public String hello() {
		return "Hello from Spring ";
	}

	@GetMapping(value = "/aseguradoras", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Aseguradoras> listarAseguradoras() {
		return aseguradorasService.findAll();

	}

	@GetMapping(value = "/aseguradoras/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Aseguradoras getAseguradora(@PathVariable("id") Integer id) {
		return aseguradorasService.find(id);

	}

	@PostMapping(value = "/aseguradoras", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Aseguradoras aseguradora) {
		aseguradorasService.save(aseguradora);
	}

	@PutMapping(value = "/aseguradoras", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Aseguradoras aseguradora) {
		aseguradorasService.save(aseguradora);
	}

	@DeleteMapping(value = "/aseguradoras/{id}")
	public void delete(@PathVariable("id") Integer id) {
		aseguradorasService.delete(id);
	}

}
