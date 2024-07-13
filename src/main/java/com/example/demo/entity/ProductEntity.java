package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.*;



@Entity
@Table(name = "product")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "price")
	private Float price;
	
	
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private CategoryEntity categoriesEntity;
	
	@OneToMany(mappedBy = "productEntity")
	private List<InventoryEntity> inventoryEntities;
	
	@OneToMany(mappedBy = "productEntity")
	private List<PurchaseOrderDetailEntity> purchaseOrderDetailEntities;

	
	@OneToMany(mappedBy = "productEntity")
	private List<SaleOrderDetailEntity> saleOrderDetailEntities;
	
	

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


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}


	public CategoryEntity getCategoriesEntity() {
		return categoriesEntity;
	}


	public void setCategoriesEntity(CategoryEntity categoriesEntity) {
		this.categoriesEntity = categoriesEntity;
	}
	
}
