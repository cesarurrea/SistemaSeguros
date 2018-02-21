package org.co.sistema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.co.sistema.dao.IAutomotoresDao;
import org.co.sistema.model.Automotores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AutomotoresService implements ISegurosService<Automotores> {

	private final IAutomotoresDao automotoresDao;

	@Autowired
	public AutomotoresService(IAutomotoresDao automotoresDao) {
		super();
		this.automotoresDao = automotoresDao;
	}

	public List<Automotores> findAll() {
		return automotoresDao.listFindAll();
	}

	public Automotores find(Integer id) {
		return automotoresDao.findOne(id);
	}

	public void save(Automotores automotor) {
		automotoresDao.save(automotor);
	}

	public void delete(Integer id) {
		automotoresDao.delete(id);
	}

}
