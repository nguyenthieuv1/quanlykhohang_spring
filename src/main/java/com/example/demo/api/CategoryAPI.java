package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CategoryDTO;
import com.example.demo.service.CategoryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/categories")
public class CategoryAPI {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("")
	public List<CategoryDTO> getAllCategories() {
		
		return categoryService.getAllCategories();
	}
	
	@PostMapping("")
	public String postMethodName(@RequestBody CategoryDTO categoryDTO) {
		//TODO: process POST request
		String res = categoryService.addCategory(categoryDTO);
		return res;
	}
	@PutMapping("/{id}")
	public String putMethodName(@PathVariable int id, @RequestBody CategoryDTO categoryDTO) {
		//TODO: process PUT request
		categoryDTO.setId(id);
		String res = categoryService.addCategory(categoryDTO);
		return res;
	}
	
	@DeleteMapping("/{id}")
	public String deleteCategory(@PathVariable int id) {
		String rs = categoryService.deleteCategory(id);
		return rs;
	}
}
