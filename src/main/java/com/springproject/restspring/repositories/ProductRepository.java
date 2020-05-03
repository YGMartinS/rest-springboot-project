package com.springproject.restspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.restspring.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
