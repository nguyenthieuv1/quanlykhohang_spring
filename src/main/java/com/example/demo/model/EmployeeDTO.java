package com.example.demo.model;

public class EmployeeDTO {
	private int id;
	private String name, position;
	private WarehouseDTO warehouseDTO;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public WarehouseDTO getWarehouseDTO() {
		return warehouseDTO;
	}
	public void setWarehouseDTO(WarehouseDTO warehouseDTO) {
		this.warehouseDTO = warehouseDTO;
	}
	
}
