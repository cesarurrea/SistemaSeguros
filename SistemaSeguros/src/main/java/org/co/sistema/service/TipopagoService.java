package org.co.sistema.service;

import java.util.List;

import javax.transaction.Transactional;

import org.co.sistema.dao.ITipopagoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.co.sistema.model.Tipopago;

@Service
@Transactional
public class TipopagoService implements ISegurosService<Tipopago> {

	private final ITipopagoDao tipopagoDao;

	@Autowired
	public TipopagoService(ITipopagoDao tipopagoDao) {
		super();
		this.tipopagoDao = tipopagoDao;
	}

	public List<Tipopago> findAll() {
		return tipopagoDao.listFindAll();
	}

	public Tipopago find(Integer id) {
		return tipopagoDao.findOne(id);
	}

	public void save(Tipopago tipopago) {
		tipopagoDao.save(tipopago);
	}

	public void delete(Integer id) {
		tipopagoDao.delete(id);
	}

}
