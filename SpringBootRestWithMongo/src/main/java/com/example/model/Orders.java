package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Orders {
	
	@Id
	private String orderId;
	private String item;
	private String orderDate;
	private String id;
	private String status;
	private String deliveryDate;
	
	public Orders(String orderId, String item, String orderDate, String id, String status, String deliveryDate) {
		super();
		this.orderId = orderId;
		this.item = item;
		this.orderDate = orderDate;
		this.id = id;
		this.status = status;
		this.deliveryDate = deliveryDate;
	}

	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	

}
