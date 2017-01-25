package com.app.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="bank")
public class Bank {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int accNum;
	private String accName;
	private String accAddress;
	
	@Column(name="accNum")
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public int getAccNum() {
		return accNum;
	}
	
	@Column(name="accName")
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	public String getAccName() {
		return accName;
	}
	
	@Column(name="accAddress")
	public void setAccAddress(String accAddress) {
		this.accAddress = accAddress;
	}
	public String getAccAddress() {
		return accAddress;
	}	
}
