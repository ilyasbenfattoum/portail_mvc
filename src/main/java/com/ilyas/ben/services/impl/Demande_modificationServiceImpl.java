package com.ilyas.ben.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ilyas.ben.dao.IDemande_modificationDao;
import com.ilyas.ben.entities.Demande_modification;
import com.ilyas.ben.services.IDemande_modificationService;

@Transactional
public class Demande_modificationServiceImpl implements IDemande_modificationService{
	
	private IDemande_modificationDao dao;
	
	public void setDao(IDemande_modificationDao dao) {
		this.dao = dao;
	}
	
	
	@Override
	public Demande_modification save(Demande_modification entity) {
		return dao.save(entity);
	}

	@Override
	public Demande_modification update(Demande_modification entity) {
		return dao.update(entity);
	}

	@Override
	public List<Demande_modification> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Demande_modification> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Demande_modification getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Demande_modification findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Demande_modification findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
