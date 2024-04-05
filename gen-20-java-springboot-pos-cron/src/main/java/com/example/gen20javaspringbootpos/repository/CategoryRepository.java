package com.example.gen20javaspringbootpos.repository;

import com.example.gen20javaspringbootpos.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
