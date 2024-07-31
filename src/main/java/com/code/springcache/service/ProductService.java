package com.code.springcache.service;

import com.code.springcache.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getProduct();
}
