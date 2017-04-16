package com.example.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Users;
import com.example.model.Orders;

public interface OrdersDao extends CrudRepository<Orders, Integer>{
	
	List<Orders> findAll();

	List<Orders> findByUsers(Users customerId);



}