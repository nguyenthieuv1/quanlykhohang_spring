package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converter.CategoryConverter;
import com.example.demo.entity.CategoryEntity;
import com.example.demo.model.CategoryDTO;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	CategoryConverter categoryConverter;
	
	@Override
	public List<CategoryDTO> getAllCategories() {
		// TODO Auto-generated method stub
		
		return categoryConverter.toListCategoryDTO(categoryRepository.findAll());
	}

	@Override
	public String addCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		CategoryEntity categoryEntity = categoryConverter.toCategoryEntity(categoryDTO);
		CategoryEntity rs = categoryRepository.save(categoryEntity);
		if (rs!=null) {
			return "thành công";
		}
		return "that bai";
	}

	@Override
	public String deleteCategory(int id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
		return "đã xóa";
	}

	

}
