package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Orders;

@Repository
public class OrdersDaoImpl implements OrdersDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}

	public List<Orders> findAll(){
		List<Orders> orders= new ArrayList<Orders>();
		Session session=sessionFactory.openSession();
		orders = session.createQuery("From com.example.model.Orders ").list();
		return orders;
	}
	
	public Orders findOne(int id){
		Session session=sessionFactory.openSession();
		Orders orders = session.get(Orders.class, id);
		return orders;
	}
	
}
