package com.teashop.shop.service;

import com.teashop.shop.entity.Category;
import com.teashop.shop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    public Category getCategoryById(Long id){
        return categoryRepository.getCategoryById(id);
    }
}
