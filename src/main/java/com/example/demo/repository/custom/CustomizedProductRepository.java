package com.example.demo.repository.custom;

import com.example.demo.model.ProductDTO;
import com.example.demo.entity.ProductEntity;

public interface CustomizedProductRepository {
	public ProductEntity findProductById(int id);
}
