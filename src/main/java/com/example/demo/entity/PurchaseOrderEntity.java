package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "purchaseorder")
public class PurchaseOrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "orderdate")
	private Date orderDate;
	
	@ManyToOne()
	@JoinColumn(name = "supplier_id")
	private SupplierEntity suppliersEntity;
	
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	private EmployeeEntity employeeEntity;
	
	
	@OneToMany(mappedBy = "purchaseOrderEntity")
	private List<PurchaseOrderDetailEntity> purchaseOrderDetailEntities;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public SupplierEntity getSuppliersEntity() {
		return suppliersEntity;
	}


	public void setSuppliersEntity(SupplierEntity suppliersEntity) {
		this.suppliersEntity = suppliersEntity;
	}


	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}


	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}


	public List<PurchaseOrderDetailEntity> getPurchaseOrderDetailEntities() {
		return purchaseOrderDetailEntities;
	}


	public void setPurchaseOrderDetailEntities(List<PurchaseOrderDetailEntity> purchaseOrderDetailEntities) {
		this.purchaseOrderDetailEntities = purchaseOrderDetailEntities;
	}
	
	
	
}
