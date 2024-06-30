package com.boot.microservice.inventory_service.repository.inventory;

import com.boot.microservice.inventory_service.domain.inventory.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends MongoRepository<Inventory, String>, InventoryRepositoryCustom {

    Inventory findBySkuCode(String skuCode);

}
