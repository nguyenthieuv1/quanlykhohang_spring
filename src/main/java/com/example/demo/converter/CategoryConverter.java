package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.CategoryEntity;
import com.example.demo.model.CategoryDTO;

@Component
public class CategoryConverter {
	@Autowired
	private ModelMapper modelMapper ;
	
	public CategoryDTO toCategoryDTO(CategoryEntity categoryEntity) {
		return modelMapper.map(categoryEntity,CategoryDTO.class);
	}
	public List<CategoryDTO> toListCategoryDTO(List<CategoryEntity> list){
		List<CategoryDTO> categoryDTOs = new ArrayList();
		for(CategoryEntity categoryEntity:list) {
			categoryDTOs.add(modelMapper.map(categoryEntity, CategoryDTO.class));
		}
		return categoryDTOs;
	}
	public CategoryEntity toCategoryEntity(CategoryDTO categoryDTO) {
		return modelMapper.map(categoryDTO,CategoryEntity.class);
	}
}
