package com.boot.microservice.order_service.domain.order.request;

import com.boot.microservice.order_service.domain.orderLineItems.OrderLineItems;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder(toBuilder = true)
public class OrderRequest {

    private List<OrderLineItems> orderLineItemsList;
}
