package com.example.demo.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.WarehouseEntity;
import com.example.demo.model.WarehouseDTO;

@Component
public class WarehouseConverter {

	@Autowired
	private ModelMapper modelMapper ;
	
	public WarehouseDTO toWarehouseDTO(WarehouseEntity warehouseEntity) {
		return modelMapper.map(warehouseEntity,WarehouseDTO.class);
	}
}
