package com.boot.microservice.order_service.repository.order;

import com.boot.microservice.order_service.domain.order.Order;
import com.boot.microservice.order_service.domain.order.request.OrderRequest;
import com.boot.microservice.order_service.domain.orderLineItems.OrderLineItems;
import com.boot.microservice.order_service.repository.orderLineItems.OrderLineItemsRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

@Slf4j
public class OrderRepositoryImpl implements OrderRepositoryCustom {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderLineItemsRepository orderLineItemsRepository;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public void placeOrder(OrderRequest orderRequest) {

        String orderId = new ObjectId().toString();

        Order orderToSave = Order.builder()
                .id(orderId)
                .orderNumber(UUID.randomUUID().toString())
                .build();

        /** save orderLineItems */
        if(orderRequest.getOrderLineItemsList().size() < 0) {

            log.warn("No orderlineitems to save");
            return;
        }

        List<OrderLineItems> orderLineItemsList = orderRequest.getOrderLineItemsList();
        orderLineItemsList.forEach(orderLineItem -> {
            orderLineItem.setOrderId(orderId);
            orderLineItem.setSkuCode(UUID.randomUUID().toString());
        });

        orderLineItemsList = orderLineItemsRepository.saveAll(orderLineItemsList);

        /** Construct the associated order */
        orderToSave = orderToSave.toBuilder()
                .orderLineItemsList(orderLineItemsList)
                .build();

        orderRepository.save(orderToSave);
    }

}
