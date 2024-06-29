package com.boot.microservice.product_service.repository.product;

import com.boot.microservice.product_service.domain.product.Product;
import com.boot.microservice.product_service.domain.product.request.ProductRequest;

import java.util.List;

public interface ProductRepositoryCustom {

    void createProduct(ProductRequest productRequest);

    List<Product> getAllProducts();
}
