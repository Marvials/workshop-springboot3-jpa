package com.marvi.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marvi.course.entities.User;

@RestController
@RequestMapping(value =  "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Ket", "Ket@gmail.com", "19092021", "123");
		return ResponseEntity.ok().body(u);
	}
	
}
