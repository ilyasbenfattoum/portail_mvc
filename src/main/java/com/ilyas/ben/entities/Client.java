package com.ilyas.ben.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="client")
public class Client extends Personne implements Serializable{
	@Id
	@GeneratedValue
	private Long id_client;
	
	private String adresse_client;
	
	@OneToMany
	private List<Demande_creation> demande_creation;

	@OneToMany
	private List<Demande_modification> demande_modification;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Long id_client, String nom_prenom, String password, String adresse_client) {
		super(nom_prenom, password);
		this.id_client = id_client;
		this.adresse_client = adresse_client;
	}

	public String getAdresse_client() {
		return adresse_client;
	}

	public void setAdresse_client(String adresse_client) {
		this.adresse_client = adresse_client;
	}

	public Long getId_client() {
		return id_client;
	}

	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}
}
