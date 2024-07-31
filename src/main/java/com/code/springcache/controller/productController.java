package com.code.springcache.controller;

import com.code.springcache.model.Product;
import com.code.springcache.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class productController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return productService.getProduct();
    }

    @PostMapping ("/products")
    public Product saveProduct( @Validated @RequestBody Product product){
        return productService.saveProduct(product);
    }

}
