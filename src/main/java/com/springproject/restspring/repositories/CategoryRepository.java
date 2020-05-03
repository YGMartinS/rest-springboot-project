package com.springproject.restspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.restspring.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
