package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converter.ProductConverter;
import com.example.demo.model.ProductDTO;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.entity.CategoryEntity;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository; 
	
	@Autowired
	private ProductConverter productConverter;

	@Override
	public List<ProductDTO> findAllByName(String name) {
		// TODO Auto-generated method stub
		List<ProductEntity> productEntities = productRepository.findByNameContaining(name);
		
		List<ProductDTO> productDTOs = new ArrayList();
		for(ProductEntity productEntity:productEntities) {
			productDTOs.add(productConverter.toProductDTO(productEntity));
		}
		
		return productDTOs;
	}

	@Override
	public String deleteProductById(int id) {
		// TODO Auto-generated method stub
		Optional<ProductEntity> productEntityOptional = productRepository.findById(id);
		if(productEntityOptional!=null) {
			productRepository.delete(productEntityOptional.get());
			return "đã xóa";
		}
		
		return "không tìm thấy sản phẩm hợp lệ";
		
	}

	@Override
	public String addProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		ProductEntity productEntity = productConverter.toProductEntity(productDTO);
		CategoryEntity categoryEntity = (CategoryEntity) categoryRepository.findById(productDTO.getCategoryId()).get();
		productEntity.setCategoriesEntity(categoryEntity);
		ProductEntity productEntitySave =productRepository.save(productEntity);
		if (productEntitySave!=null) {
			return "đã thêm thành công";
		}
		return "thất bại";
	}

	@Override
	public String updateProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		ProductEntity productEntity = productConverter.toProductEntity(productDTO);		
		CategoryEntity categoryEntity = (CategoryEntity) categoryRepository.findById(productDTO.getCategoryId()).get();
		productEntity.setCategoriesEntity(categoryEntity);
		
		ProductEntity productEntitySaved = productRepository.save(productEntity);
		if (productEntitySaved!=null) {
			return "cập nhật thành công";
		}
		return "thất bại";
	}

	@Override
	public ProductDTO findById(int id) {
		// TODO Auto-generated method stub
		ProductEntity productEntity = productRepository.findProductById(id);
		return productConverter.toProductDTO(productEntity);
	}

	

}
