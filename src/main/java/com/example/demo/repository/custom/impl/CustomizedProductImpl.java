package com.example.demo.repository.custom.impl;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.ProductDTO;
import com.example.demo.repository.custom.CustomizedProductRepository;
import com.example.demo.entity.ProductEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public class CustomizedProductImpl implements CustomizedProductRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public ProductEntity findProductById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from product where id=?";
		Query query = entityManager.createNativeQuery(sql);
		query.setParameter(1, id);

		try {
			// Execute the query and get the single result
			return (ProductEntity) query.getSingleResult();
		} catch (NoResultException e) {
			// Handle the case where no result is found
			return null;
		}
	}

}
