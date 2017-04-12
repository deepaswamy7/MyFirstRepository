package com.example.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Customers;

public interface CustomersRepo extends MongoRepository<Customers, String> {

	
}
