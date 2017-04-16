package com.example.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Users;

public interface UsersDao extends CrudRepository<Users, Integer> {

	List<Users> findAll();

	Users findById(int id);

	Users findByPassword(String password);
	
	
}
