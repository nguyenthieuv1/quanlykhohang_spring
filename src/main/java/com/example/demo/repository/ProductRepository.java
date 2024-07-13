package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.repository.custom.CustomizedProductRepository;
import com.example.demo.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>,CustomizedProductRepository{
	public List<ProductEntity> findByNameContaining(String name);
	
}
