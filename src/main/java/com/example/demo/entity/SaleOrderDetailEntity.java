package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sale_order_detail")
public class SaleOrderDetailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "price")
	private Float price;
	
	@ManyToOne()
	@JoinColumn(name = "sale_order_id")
	private SaleOrderEntity saleOrderEntity;
	
	@ManyToOne()
	@JoinColumn(name = "product_id")
	private ProductEntity productEntity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public SaleOrderEntity getSaleOrderEntity() {
		return saleOrderEntity;
	}

	public void setSaleOrderEntity(SaleOrderEntity saleOrderEntity) {
		this.saleOrderEntity = saleOrderEntity;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}
	
	
	
	
	
}
