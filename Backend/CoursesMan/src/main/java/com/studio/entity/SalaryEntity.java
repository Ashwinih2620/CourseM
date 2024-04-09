//package com.studio.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="Salary")
//public class SalaryEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // Make it Auto Increment
//	private int salId; //Make attribute Primary Key
//	
//	@Column(nullable = false,length=20)
//	private int empId;
//	
//	@Column(nullable = false,length=20)
//	private String month;
//	
//	@Column(nullable = false,length=20)
//	private int amount;
//
//	public int getSalId() {
//		return salId;
//	}
//
//	public void setSalId(int salId) {
//		this.salId = salId;
//	}
//
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getMonth() {
//		return month;
//	}
//
//	public void setMonth(String month) {
//		this.month = month;
//	}
//
//	public int getAmount() {
//		return amount;
//	}
//
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}
//
//	public SalaryEntity(int salId, int empId, String month, int amount) {
//		super();
//		this.salId = salId;
//		this.empId = empId;
//		this.month = month;
//		this.amount = amount;
//	}
//
//	public SalaryEntity() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String toString() {
//		return "SalaryEntity [salId=" + salId + ", empId=" + empId + ", month=" + month + ", amount=" + amount + "]";
//	}
//	
//	
//
//}
