package com.example.demo.service;

import java.util.List;

import com.example.demo.model.InventoryDTO;

public interface InventoryService {
	public List<InventoryDTO> findAllInventory(int warehouseId);
	
}
