package com.ilyas.ben.services;

import java.util.List;

import com.ilyas.ben.entities.Client;
import com.ilyas.ben.entities.Demande_creation;

public interface IDemande_creationService {
	public Demande_creation save(Demande_creation entity);
	public Demande_creation update(Demande_creation entity);
	public List<Demande_creation> selectAll();
	public List<Demande_creation> selectAll(String sortField,String sort);
	public Demande_creation getById(Long id);
	public void remove(Long id);
	public Demande_creation findOne(String paramName,Object paramValue);
	public Demande_creation findOne(String[] paramNames,Object[] paramValues);
	public int findCountBy(String paramName,Object paramValue);
}
