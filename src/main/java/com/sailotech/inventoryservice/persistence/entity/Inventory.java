package com.sailotech.inventoryservice.persistence.entity;

import jakarta.persistence.*;

@Entity
public class Inventory {

	@Id
	@SequenceGenerator(allocationSize = 1, name = "inventory_inventory_id_seq")
	@GeneratedValue(generator = "inventory_inventory_id_seq", strategy = GenerationType.SEQUENCE)
	private int inventoryId;
	private String skuCode;
	private int availableQuantity;
	
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	
	
	
}
