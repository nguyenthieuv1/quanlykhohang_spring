package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.WarehouseEntity;

public interface WarehouseRepository extends JpaRepository<WarehouseEntity,Integer>{

}
