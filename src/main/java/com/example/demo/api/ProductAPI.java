package com.example.demo.api;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductDTO;
import com.example.demo.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/products")
public class ProductAPI {

	@Autowired
	private ProductService productService;
	
	@GetMapping("")
	public List<ProductDTO> getMethodName(@RequestParam String name) {
		
		List<ProductDTO> productDTOs = productService.findAllByName(name);
		
		return productDTOs;
	}
	
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable int id) {
		String res = productService.deleteProductById(id);
		return res;
	}
	
	@PostMapping("")
	public String addProduct(@RequestBody ProductDTO productDTO) {
		//TODO: process POST request
		String res = productService.addProduct(productDTO);
		return res;
	}
	
	@PutMapping("/{id}")
	public String updateProduct(@PathVariable int id, @RequestBody ProductDTO productDTO) {
		//TODO: process PUT request
		productDTO.setId(id);
		String status = productService.updateProduct(productDTO);
		return status;
	}
	@GetMapping("/{id}")
	public ProductDTO getMethodName(@PathVariable int id) {
		ProductDTO productDTO = productService.findById(id);
		return productDTO;
	}
	
}
