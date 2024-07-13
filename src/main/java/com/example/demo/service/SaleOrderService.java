package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Request.SaleOrderRequest;


public interface SaleOrderService {
	public String addSaleOrder(SaleOrderRequest saleOrderRequest);
}
