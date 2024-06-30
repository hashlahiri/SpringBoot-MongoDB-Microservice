package com.boot.microservice.order_service.repository.orderLineItems;

import com.boot.microservice.order_service.domain.orderLineItems.OrderLineItems;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineItemsRepository extends MongoRepository<OrderLineItems, String>, OrderLineItemsRepositoryCustom {

}
