package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.OrdersDao;
import com.example.model.Orders;

public interface OrderService {

	List<Orders> findAll();

	Orders findOne(int id);
}
