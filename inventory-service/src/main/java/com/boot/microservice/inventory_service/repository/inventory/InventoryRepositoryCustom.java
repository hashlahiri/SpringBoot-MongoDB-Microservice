package com.boot.microservice.inventory_service.repository.inventory;

public interface InventoryRepositoryCustom {

    Boolean isInStock(String sku);
}
