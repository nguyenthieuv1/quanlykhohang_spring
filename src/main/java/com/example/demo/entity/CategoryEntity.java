package com.example.demo.entity;

import java.util.List;



import jakarta.persistence.*;


@Entity
@Table(name = "categories")
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "categoriesEntity")
	private List<ProductEntity> productsEntities;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public List<ProductEntity> getProductsEntities() {
		return productsEntities;
	}

	public void setProductsEntities(List<ProductEntity> productsEntities) {
		this.productsEntities = productsEntities;
	}
	
	
	
}
