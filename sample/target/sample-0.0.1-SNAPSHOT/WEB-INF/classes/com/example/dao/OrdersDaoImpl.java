package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

import org.apache.cxf.service.invoker.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Orders;

public class OrdersDaoImpl {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}

	@SuppressWarnings("unchcked")
	public List<Orders> findAll(){
		List<Orders> orders= new ArrayList<Orders>();
		Session session=sessionFactory.openSession();
		Orders = session.createQuery("From com.example.model.Orders").list();
		return orders;
	}
	
}
