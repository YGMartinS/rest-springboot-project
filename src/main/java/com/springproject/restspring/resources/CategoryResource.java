package com.springproject.restspring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.restspring.domain.Category;
import com.springproject.restspring.services.CategoryService;

@RestController
@SuppressWarnings("rawtypes")
@RequestMapping(value="/category")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(value="/{id}")
	public ResponseEntity findCategory(@PathVariable Integer id) {
		
		Category response = categoryService.findCategoryById(id);
		return ResponseEntity.ok(response);
	}
}
