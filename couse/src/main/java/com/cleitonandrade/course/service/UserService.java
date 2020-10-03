package com.cleitonandrade.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleitonandrade.course.entities.User;
import com.cleitonandrade.course.repositories.UserRepositoy;

@Service
public class UserService {
	
	@Autowired
	private UserRepositoy repository;
	
	public List<User> findAll(){
		return repository.findAll();
		
	}

}
