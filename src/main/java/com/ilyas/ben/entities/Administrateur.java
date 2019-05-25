package com.ilyas.ben.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="administrateur")
public class Administrateur extends Personne implements Serializable {
	@Id
	@GeneratedValue
	private Long id_admin;
	
	private String adresse_admin;
	
	@OneToMany
	private List<Demande_creation> demande_creation;

	@OneToMany
	private List<Demande_modification> demande_modification;

	
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateur( Long id_admin, String nom_prenom, String password, String adresse_admin) {
		super(nom_prenom, password);
		this.id_admin = id_admin;
		this.adresse_admin = adresse_admin;
	}

	public Long getId_admin() {
		return id_admin;
	}

	public void setId_admin(Long id_admin) {
		this.id_admin = id_admin;
	}

	public String getAdresse_admin() {
		return adresse_admin;
	}

	public void setAdresse_admin(String adresse_admin) {
		this.adresse_admin = adresse_admin;
	}
	
	
	
}
