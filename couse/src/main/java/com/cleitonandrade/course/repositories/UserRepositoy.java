package com.cleitonandrade.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleitonandrade.course.entities.User;

public interface UserRepositoy extends JpaRepository<User, Long> {
	
	 

}
