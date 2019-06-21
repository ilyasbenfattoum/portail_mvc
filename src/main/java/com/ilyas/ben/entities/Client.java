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
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	private String ville;
	private String pays;
	
	@OneToMany(mappedBy="client")
	List<Roles> roles;
	
	public List<Demande_creation> getDemande_creation() {
		return demande_creation;
	}

	public List<Demande_modification> getDemande_modification() {
		return demande_modification;
	}

	@OneToMany
	private List<Demande_creation> demande_creation;

	@OneToMany
	private List<Demande_modification> demande_modification;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nom_prenom, String password,String email, String adresse_client,String ville,String pays) {
		super(nom_prenom, password,email);
		
		this.adresse_client = adresse_client;
		this.ville=ville;
		this.pays=pays;
	}
	

	public Client(Long id_client,String nom_prenom, String password, String email,  String adresse_client, String ville,
			String pays) {
		super(nom_prenom, password, email);
		this.id_client = id_client;
		this.adresse_client = adresse_client;
		this.ville = ville;
		this.pays = pays;
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
