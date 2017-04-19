package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Orders;

public interface OrderService {
	
	@Autowired
	private OrdersDao ordersDao;

	List<Orders> findAll();
}
