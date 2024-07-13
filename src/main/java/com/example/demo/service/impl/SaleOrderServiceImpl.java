package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SaleOrderDetailEntity;
import com.example.demo.entity.SaleOrderEntity;
import com.example.demo.model.Request.SaleOrderRequest;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.ProductRepository;

import com.example.demo.repository.SaleOrderDetailRepository;
import com.example.demo.repository.SaleOrderRepository;
import com.example.demo.service.SaleOrderService;

import jakarta.transaction.Transactional;

@Service
public class SaleOrderServiceImpl implements SaleOrderService{

	
	@Autowired
	private SaleOrderRepository saleOrderRepository;
	
	@Autowired
	private SaleOrderDetailRepository saleOrderDetailRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Transactional
	@Override
	public String addSaleOrder(SaleOrderRequest saleOrderRequest) {
		// TODO Auto-generated method stub
		
		SaleOrderEntity sEntity = new SaleOrderEntity();
		SaleOrderDetailEntity sDetailEntity = new SaleOrderDetailEntity();
		
		sEntity.setOrderDate(saleOrderRequest.getOrderDate());
		sEntity.setCustomerEntity(customerRepository.findById(saleOrderRequest.getCustomerId()).get());
		sEntity.setEmployeeEntity(employeeRepository.findById(saleOrderRequest.getEmployeeId()).get());
		
		saleOrderRepository.save(sEntity);
		
		sDetailEntity.setPrice(saleOrderRequest.getPrice());
		sDetailEntity.setQuantity(saleOrderRequest.getQuantity());
		sDetailEntity.setSaleOrderEntity(sEntity);
		sDetailEntity.setProductEntity(productRepository.findById(saleOrderRequest.getProductId()).get());
		
		saleOrderDetailRepository.save(sDetailEntity);
		
		return "success";
	}
	
}
