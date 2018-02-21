package org.co.sistema.dao;

import java.util.List;

import org.co.sistema.model.Aseguradoras;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IAseguradorasDao extends CrudRepository<Aseguradoras, Integer> {

	@Query("SELECT a FROM Aseguradoras a")
	public List<Aseguradoras> listFindAll();

}
