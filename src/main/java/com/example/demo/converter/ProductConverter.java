package com.example.demo.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.ProductDTO;
import com.example.demo.entity.ProductEntity;

@Component
public class ProductConverter {
	@Autowired
	private ModelMapper modelMapper ;
	
	public ProductDTO toProductDTO(ProductEntity productEntity) {
		ProductDTO res = modelMapper.map(productEntity,ProductDTO.class);
		return res;
	}
	public ProductEntity toProductEntity(ProductDTO productDTO) {
		ProductEntity productEntity = modelMapper.map(productDTO,ProductEntity.class);
		return productEntity;
	}
}
