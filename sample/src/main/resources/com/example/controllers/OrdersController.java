package com.example.controllers;

	import java.util.List;

	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.model.Orders;
	import com.example.services.OrderService;

	@RestController
	@RequestMapping("/orders")
	public class OrdersController {

		@Autowired
		private OrderService orderService;
		
		public void setOrderService(OrderService orderService){
			this.orderService=orderService;
		}

		@RequestMapping(value="/all",method=RequestMethod.GET)
		public List<Orders> getAllOrders(){
			return orderService.findAll();
		
		}
		
		@RequestMapping(value="/{id}")
		public Orders getOrder(@PathVariable int id){
			return orderService.findOne(id);
		}
	}
