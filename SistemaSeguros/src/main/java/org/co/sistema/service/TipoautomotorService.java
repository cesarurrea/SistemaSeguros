package org.co.sistema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.co.sistema.dao.ITipoautomotorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.co.sistema.model.Tipoautomotor;

@Service
@Transactional
public class TipoautomotorService implements ISegurosService<Tipoautomotor> {

	private final ITipoautomotorDao tipoautomotorDao;

	@Autowired
	public TipoautomotorService(ITipoautomotorDao tipoautomotorDao) {
		super();
		this.tipoautomotorDao = tipoautomotorDao;
	}

	public List<Tipoautomotor> findAll() {
		return tipoautomotorDao.listFindAll();

	}

	public Tipoautomotor find(Integer id) {
		return tipoautomotorDao.findOne(id);
	}

	public void save(Tipoautomotor tipoautomotor) {
		tipoautomotorDao.save(tipoautomotor);
	}

	public void delete(Integer id) {
		tipoautomotorDao.delete(id);
	}

}
