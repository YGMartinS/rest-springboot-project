package com.springproject.restspring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.restspring.domain.Category;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@GetMapping()
	public List<Category> hello() {
		
		Category cat1 = new Category(1, "Informática");
		Category cat2 = new Category(2, "Escritório");
		
		List<Category> categories = new ArrayList<>();
		
		categories.add(cat1);
		categories.add(cat2);
		
		return categories;
	}
}
