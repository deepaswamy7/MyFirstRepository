package com.example.dao;

import java.util.List;

import org.apache.cxf.service.invoker.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Orders;

public interface OrdersDao {
	
	
	 List<Orders> findAll();

	Orders findOne(int id);
	

	//List<Orders> findByUsers(Users customerId);



}
