package com.example.dao;

import java.util.List;

import org.apache.cxf.service.invoker.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Orders;

@Component("ordersDao")
public interface OrdersDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	 List<Orders> findAll();
	

	//List<Orders> findByUsers(Users customerId);



}
