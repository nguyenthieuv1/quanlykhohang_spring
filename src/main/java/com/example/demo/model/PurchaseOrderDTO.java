package com.example.demo.model;

import java.util.Date;

import org.springframework.context.annotation.Primary;

public class PurchaseOrderDTO {

	private int id;
	private Date orderDate;
	private SuplierDTO suplierDTO;
	private EmployeeDTO employeeDTO;
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
	public SuplierDTO getSuplierDTO() {
		return suplierDTO;
	}
	public void setSuplierDTO(SuplierDTO suplierDTO) {
		this.suplierDTO = suplierDTO;
	}
	public EmployeeDTO getEmployeeDTO() {
		return employeeDTO;
	}
	public void setEmployeeDTO(EmployeeDTO employeeDTO) {
		this.employeeDTO = employeeDTO;
	}
	
	
}
