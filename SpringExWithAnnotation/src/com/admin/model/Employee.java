package com.admin.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empId")
	private int empId;
	private String empName;
	private String empAddress;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	@Column(name="empName")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	
	@Column(name="empAddress")
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	
}
	