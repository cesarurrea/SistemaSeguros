package org.co.sistema.dao;

import java.util.List;

import org.co.sistema.model.Automotores;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IAutomotoresDao extends CrudRepository<Automotores, Integer> {

	@Query("SELECT a FROM Automotores a")
	public List<Automotores> listFindAll();

}
