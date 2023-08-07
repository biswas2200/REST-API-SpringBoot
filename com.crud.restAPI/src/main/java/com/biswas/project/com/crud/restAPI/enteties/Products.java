package com.biswas.project.com.crud.restAPI.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
	@Id
	private long id;
	private String procName;
	private String description;
	
	public Products(long id, String procName, String description) {
		super();
		this.id = id;
		this.procName = procName;
		this.description = description;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProcName() {
		return procName;
	}

	public void setProcName(String procName) {
		this.procName = procName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", procName=" + procName + ", description=" + description + "]";
	}
	
	
	
	
	

}
