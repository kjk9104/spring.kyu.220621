package com.example.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.example.lesson04.model.NewUser;

@Repository
public interface NewUserDAO {
	
	public int insertNewUser(NewUser newUser);
	
	public NewUser selectLastNewUser();
}
