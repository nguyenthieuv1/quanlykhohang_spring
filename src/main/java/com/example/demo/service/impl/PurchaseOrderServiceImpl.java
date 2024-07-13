package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PurchaseOrderDetailEntity;
import com.example.demo.entity.PurchaseOrderEntity;
import com.example.demo.model.Request.PurchaseOrderAdding;
import com.example.demo.repository.SupplierRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.PurchaseOrderDetailRepository;
import com.example.demo.repository.PurchaseOrderRepository;
import com.example.demo.service.PurchaseOrderService;

import jakarta.transaction.Transactional;


@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService{

	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private PurchaseOrderDetailRepository purchaseOrderDetailRepository;
	
	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;
	
	@Override
	@Transactional
	public String addOrder(PurchaseOrderAdding pAdding) {
		// TODO Auto-generated method stub
		PurchaseOrderEntity pEntity = new PurchaseOrderEntity();
		PurchaseOrderDetailEntity pDetailEntity = new PurchaseOrderDetailEntity();
		
		
		pEntity.setOrderDate(pAdding.getOrderDate());
		pEntity.setSuppliersEntity(supplierRepository.findById(pAdding.getSupplierId()).get());
		pEntity.setEmployeeEntity(employeeRepository.findById(pAdding.getEmployeeId()).get());
		
		pDetailEntity.setPurchaseOrderEntity(pEntity);
		pDetailEntity.setProductEntity(productRepository.findById(pAdding.getProductId()).get());
		pDetailEntity.setPrice(pAdding.getPrice());
		pDetailEntity.setQuantity(pAdding.getQuantity());
		
		purchaseOrderRepository.save(pEntity);
		purchaseOrderDetailRepository.save(pDetailEntity);
		
		
		return "Thành công";
	}

}
