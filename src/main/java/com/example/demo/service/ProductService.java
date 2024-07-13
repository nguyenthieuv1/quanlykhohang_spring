package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ProductDTO;
import com.example.demo.entity.ProductEntity;

public interface ProductService {
	public List<ProductDTO> findAllByName(String name);
	public String deleteProductById(int id);
	public String addProduct(ProductDTO productDTO);
	public String updateProduct(ProductDTO productDTO);
	public ProductDTO findById(int id);
}
