package com.sailotech.inventoryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sailotech.inventoryservice.business.InventoryService;
import com.sailotech.inventoryservice.dto.InventoryDto;

@RestController
@RequestMapping("inventory")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("{skuCode}")
	public InventoryDto getBySkuCode(@PathVariable String skuCode) {
		return inventoryService.findBySkuCode(skuCode);
	}
}
