package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.InventoryEntity;
import com.example.demo.entity.WarehouseEntity;

public interface InventoryRepository extends JpaRepository<InventoryEntity,Integer>{
	public List<InventoryEntity> findBywarehouseEntity(WarehouseEntity warehouseEntity);
}
