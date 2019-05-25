package com.ilyas.ben.services;

import java.util.List;

import com.ilyas.ben.entities.Client;
import com.ilyas.ben.entities.Demande_modification;

public interface IDemande_modificationService {
	public Demande_modification save(Demande_modification entity);
	public Demande_modification update(Demande_modification entity);
	public List<Demande_modification> selectAll();
	public List<Demande_modification> selectAll(String sortField,String sort);
	public Demande_modification getById(Long id);
	public void remove(Long id);
	public Demande_modification findOne(String paramName,Object paramValue);
	public Demande_modification findOne(String[] paramNames,Object[] paramValues);
	public int findCountBy(String paramName,Object paramValue);
}
