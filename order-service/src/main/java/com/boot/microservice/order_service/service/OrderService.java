package com.boot.microservice.order_service.service;

import com.boot.microservice.order_service.domain.order.request.OrderRequest;
import com.boot.microservice.order_service.repository.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    /////////////////////////////////////////////////////////////////////

    public void placeOrderService(OrderRequest orderRequest) {

        orderRepository.placeOrder(orderRequest);
    }

}
