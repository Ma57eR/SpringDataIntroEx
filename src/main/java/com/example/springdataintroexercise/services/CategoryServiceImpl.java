package com.example.springdataintroexercise.services;

import com.example.springdataintroexercise.entities.Category;
import com.example.springdataintroexercise.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Set<Category> getRandomCategories() {

        Random random = new Random();
        long size = this.categoryRepository.count();

        int categoriesCount = random.nextInt((int) size) + 1;
        Set<Integer> categoriesIds = new HashSet<>();

        for (int i = 0; i < categoriesCount; i++) {
            int nextId =  random.nextInt((int) size) + 1;
            categoriesIds.add(nextId);
        }

        return (Set<Category>) this.categoryRepository.findAllById(categoriesIds);


    }
}
