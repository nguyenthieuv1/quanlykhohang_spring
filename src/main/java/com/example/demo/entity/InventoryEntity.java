package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory")
public class InventoryEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "quantity")
	private float quantity;
	
	@ManyToOne()
	@JoinColumn(name = "product_id")
	private ProductEntity productEntity;
	
	

	@ManyToOne()
	@JoinColumn(name = "warehouse_id")
	private WarehouseEntity warehouseEntity;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public float getQuantity() {
		return quantity;
	}



	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}



	public ProductEntity getProductsEntity() {
		return productEntity;
	}



	public void setProductsEntity(ProductEntity productsEntity) {
		this.productEntity = productsEntity;
	}



	public WarehouseEntity getWarehouseEntity() {
		return warehouseEntity;
	}



	public void setWarehouseEntity(WarehouseEntity warehouseEntity) {
		this.warehouseEntity = warehouseEntity;
	}



	@Override
	public String toString() {
		return "InventoryEntity [id=" + id + ", quantity=" + quantity + ", productEntity=" + productEntity
				+ ", warehouseEntity=" + warehouseEntity + "]";
	}
	
}
