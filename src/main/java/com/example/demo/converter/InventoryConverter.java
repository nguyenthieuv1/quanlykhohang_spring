package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.InventoryEntity;
import com.example.demo.model.InventoryDTO;

@Component
public class InventoryConverter {
	@Autowired
	private ModelMapper modelMapper ;
	public InventoryDTO toInventoryDTO(InventoryEntity inventoryEntity) {
		return modelMapper.map(inventoryEntity,InventoryDTO.class);
	}
	public List<InventoryDTO> toListInventoryDTO(List<InventoryEntity> inventoryEntities){
		List<InventoryDTO> inventoryDTOs = new ArrayList();
		for(InventoryEntity inventoryEntity:inventoryEntities) {
			inventoryDTOs.add(modelMapper.map(inventoryEntity, InventoryDTO.class));
		}
		return inventoryDTOs;
	}
}
