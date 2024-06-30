package com.boot.microservice.inventory_service.service;

import com.boot.microservice.inventory_service.repository.inventory.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    //////////////////////////////////////////////////////////////////

    public Boolean isInStockService(String sku) {

        return inventoryRepository.isInStock(sku);
    }

}
