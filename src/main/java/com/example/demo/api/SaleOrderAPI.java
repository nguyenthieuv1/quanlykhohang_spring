package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Request.SaleOrderRequest;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/sale-order")
public class SaleOrderAPI {

	@Autowired
	SaleOrderService saleOrderService; 
	
	@PostMapping("")
	public String postMethodName(@RequestBody SaleOrderRequest saleOrderRequest) {
		//TODO: process POST request
		
		String rs = saleOrderService.addSaleOrder(saleOrderRequest);
							
		return rs;
	}
	
}
