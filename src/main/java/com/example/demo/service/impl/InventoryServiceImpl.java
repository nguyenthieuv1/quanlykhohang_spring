package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converter.InventoryConverter;
import com.example.demo.converter.ProductConverter;
import com.example.demo.converter.WarehouseConverter;
import com.example.demo.entity.InventoryEntity;
import com.example.demo.entity.WarehouseEntity;
import com.example.demo.model.InventoryDTO;
import com.example.demo.repository.InventoryRepository;
import com.example.demo.repository.WarehouseRepository;
import com.example.demo.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
	private InventoryConverter inventoryConverter;
	
	@Autowired
	private ProductConverter productConverter;
	
	@Autowired
	private WarehouseConverter warehouseConverter;
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Autowired
	private WarehouseRepository warehouseRepository;
	
	@Override
	public List<InventoryDTO> findAllInventory(int warehouse_Id) {
		// TODO Auto-generated method stub
		
		WarehouseEntity warehouseEntity= warehouseRepository.findById(warehouse_Id).get();
		
		List<InventoryEntity> inventoryEntities = inventoryRepository.findBywarehouseEntity(warehouseEntity);
		List<InventoryDTO> inventoryDTOs = new ArrayList();
		for(InventoryEntity in:inventoryEntities) {
			InventoryDTO inventoryDTO = inventoryConverter.toInventoryDTO(in);
			inventoryDTO.setProductDTO(productConverter.toProductDTO(in.getProductsEntity()));
//			inventoryDTO.setWarehouseDTO(warehouseConverter.toWarehouseDTO(in.getWarehouseEntity()));
			
			inventoryDTOs.add(inventoryDTO);
		}
		
		return inventoryDTOs;
	}

	
	
}
