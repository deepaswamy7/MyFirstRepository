package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Orders;

public interface OrdersRepo extends MongoRepository<Orders, String> {

}
