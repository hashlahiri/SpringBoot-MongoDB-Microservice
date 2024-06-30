package com.boot.microservice.inventory_service.domain.inventory;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "inventory")
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder(toBuilder = true)
public class Inventory {

    @MongoId
    private String id;

    private String skuCode;

    private Integer quantity;

}
