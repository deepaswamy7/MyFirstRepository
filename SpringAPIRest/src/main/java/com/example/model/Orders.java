package com.example.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@NamedNativeQuery(name="customerNames",query="select * from Orders", resultClass=Orders.class)
@Table(name="Orders")
public class Orders {
	
	
     @Id
	 @Column(name="orderId")
	 private int orderId;
	 @Column(name="orderName")
	 private String orderName;
	 @Column(name="orderStatus")
	 private String orderStatus;
	 @Access(AccessType.PROPERTY)
	 @ManyToOne
	 @JoinColumn(name="customer_Id")
	 private Users users;
	 
	 public Orders() {
	  
	 }
	 
	 public Orders(int orderId, String orderName, String orderStatus) {
	  super();
	  this.orderId = orderId;
	  this.orderName = orderName;
	  this.orderStatus = orderStatus;
	 }

	
	 public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getOrderId() {
	  return orderId;
	 }
	 public void setOrderId(int orderId) {
	  this.orderId = orderId;
	 }
	 public String getOrderName() {
	  return orderName;
	 }
	 public void setOrderName(String orderName) {
	  this.orderName = orderName;
	 }
	 public String getOrderStatus() {
	  return orderStatus;
	 }
	 public void setOrderStatus(String orderStatus) {
	  this.orderStatus = orderStatus;
	 }
}