package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.UsersDao;
import com.example.model.Users;



@Service
public class CustomerService {
	
	@Autowired
	UsersDao usersDao;
	
	public List<Users> getAll(){
		return usersDao.findAll();
	}
	
	
	public Users getOneUser(int id){
		return usersDao.findOne(id);
	}
	
	public Users getById(int id){
		return usersDao.findById(id);
	}
	
	public Users getByPassword(String password){
		return usersDao.findByPassword(password);
	}

}