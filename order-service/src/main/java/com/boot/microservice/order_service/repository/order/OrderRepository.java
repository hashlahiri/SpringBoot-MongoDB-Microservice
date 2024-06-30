package com.boot.microservice.order_service.repository.order;

import com.boot.microservice.order_service.domain.order.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String>, OrderRepositoryCustom {
}
