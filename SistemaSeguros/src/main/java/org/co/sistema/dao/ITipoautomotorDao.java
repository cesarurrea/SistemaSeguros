package org.co.sistema.dao;

import java.util.List;

import org.co.sistema.model.Tipoautomotor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ITipoautomotorDao extends CrudRepository<Tipoautomotor, Integer>{
	
	@Query("SELECT t FROM Tipoautomotor t")
	public List<Tipoautomotor> listFindAll();

}
