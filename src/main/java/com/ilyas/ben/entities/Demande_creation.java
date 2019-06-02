package com.ilyas.ben.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demande_creation")
public class Demande_creation {
	@Id
	@GeneratedValue
	private Long id_demandec;
	
	private String nom_prenom;
	private String password;
	private String adresse_client;
	private String email;
	private String pays;
	private String ville;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Demande_creation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Demande_creation(Long id_demandec, String nom_prenom, String password, String adresse_client) {
		super();
		this.id_demandec = id_demandec;
		this.nom_prenom = nom_prenom;
		this.password = password;
		this.adresse_client = adresse_client;
	}

	public Long getId_demandec() {
		return id_demandec;
	}
	public void setId_demandec(Long id_demandec) {
		this.id_demandec = id_demandec;
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
