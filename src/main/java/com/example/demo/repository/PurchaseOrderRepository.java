package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PurchaseOrderEntity;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrderEntity,Integer>{

}
