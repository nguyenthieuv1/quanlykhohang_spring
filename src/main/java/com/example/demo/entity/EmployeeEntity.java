package com.example.demo.entity;

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
@Table(name = "employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "positon")
	private String position;
	
	@ManyToOne()
	@JoinColumn(name = "warehouse_id")
	private WarehouseEntity warehouseEntity;
	
	@OneToMany(mappedBy = "employeeEntity")
	private List<PurchaseOrderEntity> purchaseOrderEntities;
	
	@OneToMany(mappedBy = "employeeEntity")
	private List<SaleOrderEntity> saleOrderEntities; 
	
}
