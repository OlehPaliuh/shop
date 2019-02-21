package com.teashop.shop.controller;

import com.teashop.shop.entity.Product;
import com.teashop.shop.service.CategoryService;
import com.teashop.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public void createCategory(@RequestBody Product product) {
        productService.createProduct(product);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }
}
