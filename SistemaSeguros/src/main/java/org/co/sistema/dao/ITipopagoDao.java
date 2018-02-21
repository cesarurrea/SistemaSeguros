package org.co.sistema.dao;

import java.util.List;

import org.co.sistema.model.Tipopago;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ITipopagoDao extends CrudRepository<Tipopago, Integer> {

	@Query("SELECT t FROM Tipopago t")
	public List<Tipopago> listFindAll();

}
