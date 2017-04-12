package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customers {
	
	public Customers() {
		
	}
		public Customers(String id, String name, String orderId, String city) {
		super();
		this.id = id;
		this.name = name;
		this.orderId = orderId;
		this.city=city;
	}
		@Id
		private String id;
		private String name;
		private String city;
		private String orderId;
		
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getId() {
		return id;
		}
		public void setId(String id) {
		this.id = id;
		}
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		public String getOrderId() {
		return orderId;
		}
		public void setOrderId(String orderId) {
		this.orderId = orderId;
		}
}
