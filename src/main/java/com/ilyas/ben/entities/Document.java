package com.ilyas.ben.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Document")
public class Document implements Serializable{
	@Id
	@GeneratedValue
	private Long id_document;
	private String date;
	private String client;
	private String description;

	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Document(Long id_document, String date, String client, String description) {
		super();
		this.id_document = id_document;
		this.date = date;
		this.client = client;
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Long getId_document() {
		return id_document;
	}

	public void setId_document(Long id_document) {
		this.id_document = id_document;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
