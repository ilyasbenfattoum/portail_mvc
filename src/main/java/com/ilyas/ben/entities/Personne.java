package com.ilyas.ben.entities;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public class Personne {
	
	protected String nom_prenom;
	
	
	protected String password;
	
	protected String email;
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Personne(String nom_prenom, String password,String email) {
		this.nom_prenom = nom_prenom;
		this.password = password;
		this.email=email;
	}


	public String getNom_prenom() {
		return nom_prenom;
	}
	public void setNom_prenom(String nom_prenom) {
		this.nom_prenom = nom_prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
