package com.boot.microservice.product_service.repository.product;

import com.boot.microservice.product_service.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ProductRepository extends MongoRepository<Product, Serializable>, ProductRepositoryCustom {
}
