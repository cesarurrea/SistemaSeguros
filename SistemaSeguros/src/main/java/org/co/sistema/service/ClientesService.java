package org.co.sistema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.co.sistema.dao.IClientesDao;
import org.co.sistema.model.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientesService implements ISegurosService<Clientes> {

	private final IClientesDao clientesService;

	@Autowired
	public ClientesService(IClientesDao clientesService) {
		super();
		this.clientesService = clientesService;
	}

	public List<Clientes> findAll() {
		return clientesService.listFindAll();
	}

	public Clientes find(Integer id) {
		return clientesService.findOne(id);
	}

	public void save(Clientes cliente) {
		clientesService.save(cliente);
	}

	public void delete(Integer id) {
		clientesService.delete(id);
	}

}
