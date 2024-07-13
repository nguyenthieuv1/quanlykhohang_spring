package com.example.demo.model;


public class InventoryDTO {
	private int id;
	private ProductDTO productDTO;
	private int quantity;
	private WarehouseDTO warehouseDTO;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public WarehouseDTO getWarehouseDTO() {
		return warehouseDTO;
	}
	public void setWarehouseDTO(WarehouseDTO warehouseDTO) {
		this.warehouseDTO = warehouseDTO;
	}
	
	
}
