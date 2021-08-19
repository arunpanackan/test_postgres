package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
//@Table(name="productx")
//@Table(name="\"product\"")
//@Table(name="product")
public class product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String namez;
	private String description;
	
	
	
	public product() { //Each entity need a default constructor and getter and setter methods.

		
	}

	public product(Long id, String namez, String description) {
		
		this.id = id;
		this.namez = namez;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return namez;
	}

	public void setName(String namez) {
		this.namez = namez;
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String description) {
		this.description = description;
	}
	
	
	
	
	
	
	
	

}
