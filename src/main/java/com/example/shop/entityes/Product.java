package com.example.shop.entityes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="shop", name = "products")
public class Product {
	@Id@GeneratedValue
	private Long id;
	@Column(nullable = false, length = 100)
	private String name;
	@Column(nullable = false, length = 1000)
	private String description;
	
	

	public Product(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Product() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
