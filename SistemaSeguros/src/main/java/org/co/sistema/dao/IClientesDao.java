package org.co.sistema.dao;

import java.util.List;

import org.co.sistema.model.Clientes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IClientesDao extends CrudRepository<Clientes, Integer> {

	@Query("SELECT c FROM Clientes c")
	public List<Clientes> listFindAll();

}
