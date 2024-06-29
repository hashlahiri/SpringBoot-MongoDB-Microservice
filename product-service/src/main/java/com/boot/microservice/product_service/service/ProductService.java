package com.boot.microservice.product_service.service;

import com.boot.microservice.product_service.domain.product.Product;
import com.boot.microservice.product_service.domain.product.request.ProductRequest;
import com.boot.microservice.product_service.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    ////////////////////////////////////////////////////////////////////////////////////


    public void createProductService(ProductRequest productRequest) {

        productRepository.createProduct(productRequest);
    }

    public List<Product> getAllProductsService() {

        return productRepository.getAllProducts();
    }
}
