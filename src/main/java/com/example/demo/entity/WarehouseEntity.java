package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "warehouse")
public class WarehouseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "location")
	private String location;
	
	
	@OneToMany(mappedBy = "warehouseEntity")
	private List<InventoryEntity> inventoryEntities;
	
	@OneToMany(mappedBy = "warehouseEntity")
	private List<EmployeeEntity> employeeEntities;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<InventoryEntity> getInventoryEntities() {
		return inventoryEntities;
	}

	public void setInventoryEntities(List<InventoryEntity> inventoryEntities) {
		this.inventoryEntities = inventoryEntities;
	}

	public List<EmployeeEntity> getEmployeeEntities() {
		return employeeEntities;
	}

	public void setEmployeeEntities(List<EmployeeEntity> employeeEntities) {
		this.employeeEntities = employeeEntities;
	}
	
	
	
}
