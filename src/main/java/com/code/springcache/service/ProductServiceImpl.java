package com.code.springcache.service;

import com.code.springcache.dto.ProductRepository;
import com.code.springcache.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    @Cacheable(value = "products")
    public List<Product> getProduct() {
        System.out.println("inside the get products");
        return (List<Product>) productRepository.findAll();
    }
}
