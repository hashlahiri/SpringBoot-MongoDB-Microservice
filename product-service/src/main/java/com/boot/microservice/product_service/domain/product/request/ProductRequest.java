package com.boot.microservice.product_service.domain.product.request;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder(toBuilder = true)
public class ProductRequest {

    private String name;

    private String description;

    private Long price;
}
