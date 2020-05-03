package com.springproject.restspring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.restspring.domain.Category;
import com.springproject.restspring.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public Category findCategoryById(Integer id) {
		Optional<Category> response = categoryRepository.findById(id);
		return response.orElse(null);
	}
}
