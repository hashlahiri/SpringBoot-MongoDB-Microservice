package com.boot.microservice.product_service.repository.product;

import com.boot.microservice.product_service.domain.product.Product;
import com.boot.microservice.product_service.domain.product.request.ProductRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class ProductRepositoryImpl implements ProductRepositoryCustom {

    @Autowired
    private ProductRepository productRepository;

    ///////////////////////////////////////////////////////////////////////////////////


    @Override
    public void createProduct(ProductRequest productRequest) {

        try {
            Product productToSave = Product.builder()
                    .name(productRequest.getName())
                    .description(productRequest.getDescription())
                    .price(productRequest.getPrice())
                    .build();

            productToSave = productRepository.save(productToSave);
            log.info("Product Saved {} ", productToSave.getId());

        } catch (Exception e) {

            log.error("Something went wrong inside 'createProduct'");
            log.error("{} | {}", e.getMessage(), e.getClass());
        }
    }


    @Override
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

}
