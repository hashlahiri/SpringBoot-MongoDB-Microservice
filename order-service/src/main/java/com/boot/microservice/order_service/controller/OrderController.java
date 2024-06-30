package com.boot.microservice.order_service.controller;

import com.boot.microservice.order_service.domain.order.request.OrderRequest;
import com.boot.microservice.order_service.service.OrderService;
import com.boot.microservice.order_service.utility.APIEndpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(APIEndpoints.ORDER_API_ENDPOINT)
public class OrderController {

    @Autowired
    private OrderService orderService;

    ////////////////////////////////////////////////////////////////////////////////////////

    @PostMapping
    public ResponseEntity<Void> placeOrder(@RequestBody OrderRequest orderRequest) {

        orderService.placeOrderService(orderRequest);

         return new ResponseEntity<>(HttpStatus.OK);
    }

}

