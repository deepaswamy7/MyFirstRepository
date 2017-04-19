package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.OrdersDao;
import com.example.model.Orders;

public class OrderServiceImpl implements OrderService{
	
@Autowired
private OrdersDao ordersDao;

@Override
public List<Orders> findAll(){

return ordersDao.findAll();
}
}
