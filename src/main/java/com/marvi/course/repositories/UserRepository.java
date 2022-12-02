package com.marvi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marvi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
}
