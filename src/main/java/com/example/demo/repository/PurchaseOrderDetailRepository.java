package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PurchaseOrderDetailEntity;


public interface PurchaseOrderDetailRepository extends JpaRepository<PurchaseOrderDetailEntity,Integer>{

}
