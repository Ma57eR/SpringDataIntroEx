package com.example.springdataintroexercise.services;

import com.example.springdataintroexercise.entities.Category;

import java.util.Set;

public interface CategoryService {
    Set<Category> getRandomCategories();
}
