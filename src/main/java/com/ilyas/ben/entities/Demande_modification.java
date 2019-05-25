package com.ilyas.ben.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demande_modification")
public class Demande_modification {
	@Id
	@GeneratedValue
	private Long id_demandem;
	
	private String nom_prenom;
	private String password;
	private String adresse_client;
	
	
	public Demande_modification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Demande_modification(Long id_demandem, String nom_prenom, String password, String adresse_client) {
		super();
		this.id_demandem = id_demandem;
		this.nom_prenom = nom_prenom;
		this.password = password;
		this.adresse_client = adresse_client;
	}


	public Long getId_demandem() {
		return id_demandem;
	}
	public void setId_demandem(Long id_demandem) {
		this.id_demandem = id_demandem;
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
	public String getAdresse_client() {
		return adresse_client;
	}
	public void setAdresse_client(String adresse_client) {
		this.adresse_client = adresse_client;
	}
	
}
