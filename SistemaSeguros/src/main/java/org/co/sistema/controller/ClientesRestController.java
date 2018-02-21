package org.co.sistema.controller;

import java.util.List;

import org.co.sistema.model.Clientes;
import org.co.sistema.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ClientesRestController extends AbstractSegurosRestController<Clientes> {

	@Autowired
	public ClientesRestController(ClientesService service) {
		super(service);
	}

	@Override
	@GetMapping(value = "/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Clientes> findAll() {
		return service.findAll();
	}

	@Override
	@GetMapping(value = "/clientes/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Clientes find(Integer id) {
		return service.find(id);
	}

	@Override
	@PostMapping(value = "/clientes", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(Clientes entity) {
		service.save(entity);

	}

	@Override
	@PutMapping(value = "/clientes", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(Clientes entity) {
		service.save(entity);

	}

	@Override
	@DeleteMapping(value = "/clientes/{id}")
	public void delete(Integer id) {
		service.delete(id);

	}

}
