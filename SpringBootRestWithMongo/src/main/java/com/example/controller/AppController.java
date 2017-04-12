package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customers;
import com.example.repo.CustomersRepo;


@RestController
public class AppController {
	
	@Autowired
	private CustomersRepo customersRepo;
	
	
	@RequestMapping("/hello")
	public String printMsg()
	{
		return "Hello spring boot";
	}

	
	@RequestMapping("/customers")
	public List<Customers> getAllCustomers()
	{
		System.out.println("enterrrrrrrrr-------"+customersRepo.findAll());
		return customersRepo.findAll();
		
	}
	
	@RequestMapping("/customers/{id}")
	public Customers getCustomer(@PathVariable String id)
	{
	return customersRepo.findOne(id);	
	}
}


