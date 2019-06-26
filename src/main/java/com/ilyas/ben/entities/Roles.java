package com.ilyas.ben.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Roles {
	@Id
	@GeneratedValue
	private Long idRole;
	private String Rolename;
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;
	
	public Roles() {
		super();
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getRolename() {
		return Rolename;
	}

	public void setRolename(String rolename) {
		Rolename = rolename;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
}
