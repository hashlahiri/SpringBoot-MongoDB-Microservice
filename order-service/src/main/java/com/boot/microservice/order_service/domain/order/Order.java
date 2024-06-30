package com.boot.microservice.order_service.domain.order;

import com.boot.microservice.order_service.domain.orderLineItems.OrderLineItems;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@Document(collection = "order")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder(toBuilder = true)
public class Order {

    @MongoId
    private String id;

    private String orderNumber;

    private List<OrderLineItems> orderLineItemsList;
}
