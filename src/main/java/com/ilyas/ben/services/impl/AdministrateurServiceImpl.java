package com.ilyas.ben.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ilyas.ben.dao.IAdministrateurDao;
import com.ilyas.ben.entities.Administrateur;
import com.ilyas.ben.services.IAdministrateurService;

@Transactional
public class AdministrateurServiceImpl implements IAdministrateurService{
	
	private IAdministrateurDao dao;
	
	public void setDao(IAdministrateurDao dao) {
		this.dao = dao;
	}
	
	
	@Override
	public Administrateur save(Administrateur entity) {
		return dao.save(entity);
	}

	@Override
	public Administrateur update(Administrateur entity) {
		return dao.update(entity);
	}

	@Override
	public List<Administrateur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Administrateur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Administrateur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Administrateur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Administrateur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
