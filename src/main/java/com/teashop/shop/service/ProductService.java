package com.teashop.shop.service;

import com.teashop.shop.entity.Product;
import com.teashop.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createProduct(Product product) {
        productRepository.save(product);
    }

    public Product getProductById(Long id){
        return productRepository.getOne(id);
    }

}
