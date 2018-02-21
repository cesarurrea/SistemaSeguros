package org.co.sistema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.co.sistema.dao.IAseguradorasDao;
import org.co.sistema.model.Aseguradoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AseguradorasService implements ISegurosService<Aseguradoras> {

	private final IAseguradorasDao aseguradorasDao;

	@Autowired
	public AseguradorasService(IAseguradorasDao aseguradorasDao) {
		super();
		this.aseguradorasDao = aseguradorasDao;
	}

	public List<Aseguradoras> findAll() {
		return aseguradorasDao.listFindAll();

	}

	public Aseguradoras find(Integer id) {
		return aseguradorasDao.findOne(id);

	}

	public void save(Aseguradoras aseguradora) {
		aseguradorasDao.save(aseguradora);
	}

	public void delete(Integer id) {
		aseguradorasDao.delete(id);
	}

}
