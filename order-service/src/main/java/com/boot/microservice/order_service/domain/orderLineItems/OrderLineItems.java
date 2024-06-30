package com.boot.microservice.order_service.domain.orderLineItems;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "orderLineItems")
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder(toBuilder = true)
public class OrderLineItems {

    @MongoId
    private String id;

    private String orderId;

    private String skuCode;

    private Double price;

    private Integer quantity;
}
