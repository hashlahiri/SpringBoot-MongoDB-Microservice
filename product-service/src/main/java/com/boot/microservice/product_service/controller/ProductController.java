package com.boot.microservice.product_service.controller;

import com.boot.microservice.product_service.domain.product.Product;
import com.boot.microservice.product_service.domain.product.request.ProductRequest;
import com.boot.microservice.product_service.service.ProductService;
import com.boot.microservice.product_service.utility.ApiEndpoints;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiEndpoints.PRODUCT_API_ENDPOINT)
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    /////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Create product endpoint
     *
     * @param productRequest - {@link ProductRequest}
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProductEndpoint(@RequestBody ProductRequest productRequest) {

        productService.createProductService(productRequest);
    }

    /**
     * Get all products
     *
     * @return - {@link List<Product>}
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getProductsEndpoint() {

        return productService.getAllProductsService();
    }

}
