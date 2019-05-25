package com.ilyas.ben.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ilyas.ben.dao.IDocumentDao;
import com.ilyas.ben.entities.Document;
import com.ilyas.ben.services.IDocumentService;

@Transactional
public class DocumentServiceImpl implements IDocumentService{
	
	private IDocumentDao dao;
	
	public void setDao(IDocumentDao dao) {
		this.dao = dao;
	}
	
	
	@Override
	public Document save(Document entity) {
		return dao.save(entity);
	}

	@Override
	public Document update(Document entity) {
		return dao.update(entity);
	}

	@Override
	public List<Document> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Document> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Document getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Document findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Document findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
