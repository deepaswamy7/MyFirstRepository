package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.OrdersDao;
import com.example.model.Orders;


@Service
public class OrderServiceImpl implements OrderService{
	
@Autowired
private OrdersDao ordersDao;

@Override
public List<Orders> findAll(){

return ordersDao.findAll();
}
public Orders findOne(int id){
	return ordersDao.findOne(id);
}

}
