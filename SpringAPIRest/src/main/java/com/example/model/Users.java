package com.example.model;

import javax.persistence.*;


@Entity
@Table(name="Users")
public class Users {


	@Id
	@Column(name="id")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="city")
	private String city;
	@Column(name="password")
	private String password;
	
	public Users() {
	}
	public Users(int id, String username, String city, String password) {
		super();
		this.id = id;
		this.username = username;
		this.city = city;
		this.password=password;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
