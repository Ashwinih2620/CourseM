//package com.studio.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name="SalaryReport")
//public class SalReportEntity {
//	
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // Make it Auto Increment
//	private int salrepId; //Make attribute Primary Key
//	
//	@Column(nullable = false,length=20)
//	private String empName;
//	
//	@Column(nullable = false,length=20)
//	private String month;
//	
//	@Column(nullable = false,length=20)
//	private int amount;
//
//	public int getSalrepId() {
//		return salrepId;
//	}
//
//	public void setSalrepId(int salrepId) {
//		this.salrepId = salrepId;
//	}
//
//	public String getEmpName() {
//		return empName;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
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
//	public SalReportEntity() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public SalReportEntity(int salrepId, String empName, String month, int amount) {
//		super();
//		this.salrepId = salrepId;
//		this.empName = empName;
//		this.month = month;
//		this.amount = amount;
//	}
//
//	@Override
//	public String toString() {
//		return "SalReportEntity [salrepId=" + salrepId + ", empName=" + empName + ", month=" + month + ", amount="
//				+ amount + "]";
//	}
//	
//	
//
//}
