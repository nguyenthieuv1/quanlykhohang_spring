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
@Table(name = "saleorder")
public class SaleOrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "order_date")
	private Date orderDate;
	
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	private EmployeeEntity employeeEntity;
	
	@OneToMany(mappedBy = "saleOrderEntity")
	private List<SaleOrderDetailEntity> saleOrderDetailEntities;
	
	@ManyToOne()
	@JoinColumn(name = "customer_id")
	private CustomerEntity customerEntity;

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

	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}

	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}

	public List<SaleOrderDetailEntity> getSaleOrderDetailEntities() {
		return saleOrderDetailEntities;
	}

	public void setSaleOrderDetailEntities(List<SaleOrderDetailEntity> saleOrderDetailEntities) {
		this.saleOrderDetailEntities = saleOrderDetailEntities;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
	
	
}
