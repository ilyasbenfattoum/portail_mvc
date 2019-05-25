package com.ilyas.ben.services;

import java.util.List;

import com.ilyas.ben.entities.Administrateur;

public interface IAdministrateurService {
	public Administrateur save(Administrateur entity);
	public Administrateur update(Administrateur entity);
	public List<Administrateur> selectAll();
	public List<Administrateur> selectAll(String sortField,String sort);
	public Administrateur getById(Long id);
	public void remove(Long id);
	public Administrateur findOne(String paramName,Object paramValue);
	public Administrateur findOne(String[] paramNames,Object[] paramValues);
	public int findCountBy(String paramName,Object paramValue);
}
