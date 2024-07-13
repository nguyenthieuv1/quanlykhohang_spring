package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Request.PurchaseOrderAdding;
import com.example.demo.service.PurchaseOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/purchase-order")
public class PurchaseOrderAPI {

	@Autowired
	PurchaseOrderService purchaseOrderService;
	
	@PostMapping("")
	public String postMethodName(@RequestBody PurchaseOrderAdding purchaseOrderAdding) {
		//TODO: process POST request
		String res = purchaseOrderService.addOrder(purchaseOrderAdding);
		return res;
	}
	
}
