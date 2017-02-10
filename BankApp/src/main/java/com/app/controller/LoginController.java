package com.app.controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.configuration.HibernateConfiguration;
import com.app.dao.CustomerDao;
import com.app.model.CustomerDetails;



@Controller
public class LoginController {
	
	@Autowired
	CustomerDao customerDao;


	@RequestMapping(value="login", method=RequestMethod.GET)
	private String login(HttpServletRequest req, HttpServletResponse resp) {
		
             	return "login";
	}
	
	@RequestMapping(value="main", method=RequestMethod.POST)
	private String signIn(HttpServletRequest req, HttpServletResponse resp) {
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		
		Session session = HibernateConfiguration.getSessionFactory();
		session.beginTransaction();
		Query query = session.getNamedQuery("custQuery");
		Query emailId=query.setParameter(0, email);
		Query pass= query.setParameter(1, pwd);
		
		session.getTransaction().commit();
		
		if(email.equals(emailId) && pwd.equals(pass))
			{
			return "app/main";
		}
		else
		return "app/Fail";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	private String signUp(HttpServletRequest req, HttpServletResponse resp) {
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String emailId = req.getParameter("email");
		String password = req.getParameter("password");
		
		CustomerDetails customer = new CustomerDetails();
		customer.setFirstname(firstname);
		customer.setLastname(lastname);
		customer.setEmail(emailId);
		customer.setPassword(password);
		
		customerDao.save(customer);
		
		return "app/main";
	}
	
	@RequestMapping(value="app/main", method=RequestMethod.POST)
	private String deposit(HttpServletRequest req, HttpServletResponse resp) {
	CustomerDetails customer = new CustomerDetails();
	
	customerDao.save(customer);
	return "app/main";
	}
}