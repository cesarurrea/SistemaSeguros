package org.co.sistema.controller;

import java.util.List;

import org.co.sistema.service.ISegurosService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class AbstractSegurosRestController<T> {
	protected ISegurosService<T> service;

	public AbstractSegurosRestController(ISegurosService<T> service) {
		super();
		this.service = service;
	}

	public abstract List<T> findAll();

	public abstract T find(@PathVariable("id") Integer id);

	public abstract void save(@RequestBody T entity);

	public abstract void create(@RequestBody T entity);

	public abstract void delete(@PathVariable("id") Integer id);

}
