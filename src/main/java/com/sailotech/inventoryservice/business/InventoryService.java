package com.sailotech.inventoryservice.business;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sailotech.inventoryservice.dto.InventoryDto;
import com.sailotech.inventoryservice.persistence.entity.Inventory;
import com.sailotech.inventoryservice.persistence.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public InventoryDto findBySkuCode(String skuCode) {
		Inventory inventory = this.inventoryRepository.findBySkuCode(skuCode).orElse(null);
		return inventory == null
				? null
				: modelMapper.map(inventory, InventoryDto.class);
	}
}
