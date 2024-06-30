package com.boot.microservice.order_service.repository.order;

import com.boot.microservice.order_service.domain.order.request.OrderRequest;

public interface OrderRepositoryCustom {

    void placeOrder(OrderRequest orderRequest);
}
