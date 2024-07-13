package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SupplierEntity;

public interface SupplierRepository extends JpaRepository<SupplierEntity,Integer>{

}
