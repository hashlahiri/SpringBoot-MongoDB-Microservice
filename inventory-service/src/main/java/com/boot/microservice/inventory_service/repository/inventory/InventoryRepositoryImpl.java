package com.boot.microservice.inventory_service.repository.inventory;

import com.boot.microservice.inventory_service.domain.inventory.Inventory;
import org.springframework.beans.factory.annotation.Autowired;

public class InventoryRepositoryImpl implements InventoryRepositoryCustom {

    @Autowired
    private InventoryRepository inventoryRepository;

    /////////////////////////////////////////////////////////////////////////////


    @Override
    public Boolean isInStock(String sku) {

        Boolean response = false;

        Inventory inventory = inventoryRepository.findBySkuCode(sku);
        if(inventory != null) {

            response = true;
        }

        return response;
    }


}
