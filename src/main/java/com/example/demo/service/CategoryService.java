package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CategoryDTO;

public interface CategoryService {
	public List<CategoryDTO> getAllCategories();
	public String addCategory(CategoryDTO categoryDTO);
	public String deleteCategory(int id); 
}
