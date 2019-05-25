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
	
	private String description;

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
