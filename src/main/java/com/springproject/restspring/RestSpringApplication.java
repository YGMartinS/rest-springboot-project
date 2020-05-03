package com.springproject.restspring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springproject.restspring.domain.Category;
import com.springproject.restspring.domain.Product;
import com.springproject.restspring.repositories.CategoryRepository;
import com.springproject.restspring.repositories.ProductRepository;

@SpringBootApplication
public class RestSpringApplication implements CommandLineRunner {

	@Autowired 
	private CategoryRepository categoryRepository;
	
	@Autowired 
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RestSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat01 = new Category(null, "Informática");
		Category cat02 = new Category(null, "Escritório");
		
		Product p01 = new Product (null, "Computador", 2000.00);
		Product p02 = new Product (null, "Impressora", 800.00);
		Product p03 = new Product (null, "Mouse", 80.00);
		
		cat01.getProducts().addAll(Arrays.asList(p01, p02, p03));
		cat02.getProducts().addAll(Arrays.asList(p02));
		
		p01.getCategories().addAll(Arrays.asList(cat01));
		p02.getCategories().addAll(Arrays.asList(cat01, cat02));
		p03.getCategories().addAll(Arrays.asList(cat01));
		
		categoryRepository.saveAll(Arrays.asList(cat01, cat02));
		productRepository.saveAll(Arrays.asList(p01, p02, p03));

	}

}
