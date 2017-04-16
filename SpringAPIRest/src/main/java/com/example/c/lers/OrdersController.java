package com.example.c.lers;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.OrdersDao;
import com.example.model.Orders;
import com.example.model.Users;

@RestController
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersDao ordersDao;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	/*@RequestMapping("/all")
	public List<Orders> getAllOrders(){
		
	Session session;
	try {
	    session = sessionFactory.getCurrentSession();
	} catch (HibernateException e) {
	    session = sessionFactory.openSession();
	}
	session.beginTransaction();
	
	Query query = session.getNamedQuery("customerNames");
	
	List<Orders> custs = (List<Orders>) query.list();
	
	session.close();
	return custs;
	}
	*/
	
	@RequestMapping("/all")
	public List<Orders> getAllOrders(){
		return ordersDao.findAll();
	}
	
	@RequestMapping("/{id}")
	public Orders getOrder(@PathVariable int id){
		return ordersDao.findOne(id);
	}
	/*
	@RequestMapping("/{orderId}")
	public Orders getOneOrder(@PathVariable int orderId){
		return ordersDao.findOne(orderId);
	}*/
	
	
	@RequestMapping("{customerId}/all")
	public List<Orders> getCustomerOrders(@PathVariable Users customerId){
		return ordersDao.findByUsers(customerId);
	}
}