package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.InventoryDTO;
import com.example.demo.service.InventoryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/inventories")
public class InventoryAPI {
	
	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("")
	public List<InventoryDTO> getMethodName(@RequestParam int idwarehouse) {					
		return inventoryService.findAllInventory(idwarehouse);
	}
	
	
}
