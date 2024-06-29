package com.boot.microservice.product_service.domain.product;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder(toBuilder = true)
@Document(value = "product")
public class Product {

    @Id
    private String id;

    private String name;

    private String description;

    private Long price;
}
