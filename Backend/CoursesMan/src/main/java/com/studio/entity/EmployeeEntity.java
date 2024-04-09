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
//@Table(name="Employee")
//public class EmployeeEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // Make it Auto Increment
//	private int employeeId; //Make attribute Primary Key
//	
//	@Column(nullable = false,length=20)
//	private String employeeName;
//	
//	@Column(nullable = false,length=20)
//	private int salary;
//
//	public int getEmployeeId() {
//		return employeeId;
//	}
//
//	public void setEmployeeId(int employeeId) {
//		this.employeeId = employeeId;
//	}
//
//	public String getEmployeeName() {
//		return employeeName;
//	}
//
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//
//	public EmployeeEntity(int employeeId, String employeeName, int salary) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//		this.salary = salary;
//	}
//
//	public EmployeeEntity() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String toString() {
//		return "EmployeeEntity [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
//				+ "]";
//	}
//	
//	
//
//}
