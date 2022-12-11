package com.marvi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marvi.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>  {
	
}

