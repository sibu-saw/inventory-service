package com.sailotech.inventoryservice.persistence.repository;

import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;

import com.sailotech.inventoryservice.persistence.entity.Inventory;

public interface InventoryRepository extends ListCrudRepository<Inventory, Integer> {

	public Optional<Inventory> findBySkuCode(String skuCode);
}
