package com.ilyas.ben.services;

import java.util.List;

import com.ilyas.ben.entities.Client;
import com.ilyas.ben.entities.Document;

public interface IDocumentService {
	public Document save(Document entity);
	public Document update(Document entity);
	public List<Document> selectAll();
	public List<Document> selectAll(String sortField,String sort);
	public Document getById(Long id);
	public void remove(Long id);
	public Document findOne(String paramName,Object paramValue);
	public Document findOne(String[] paramNames,Object[] paramValues);
	public int findCountBy(String paramName,Object paramValue);
}
