package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SaleOrderDetailEntity;

public interface SaleOrderDetailRepository extends JpaRepository<SaleOrderDetailEntity, Integer>{

}
