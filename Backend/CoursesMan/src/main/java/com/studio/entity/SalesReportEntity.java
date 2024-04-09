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
//@Table(name="SalesReport")
//public class SalesReportEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // Make it Auto Increment
//	private int salesrepId; //Make attribute Primary Key
//	
//	@Column(nullable = false,length=20)
//	private int custId;
//	
//	@Column(nullable = false,length=20)
//	private String custName;
//	
//	@Column(nullable = false,length=20)
//	private int bill_Id;
//	
//	@Column(nullable = false,length=20)
//	private int bill_amount;
//
//	public int getSalesrepId() {
//		return salesrepId;
//	}
//
//	public void setSalesrepId(int salesrepId) {
//		this.salesrepId = salesrepId;
//	}
//
//	public int getCustId() {
//		return custId;
//	}
//
//	public void setCustId(int custId) {
//		this.custId = custId;
//	}
//
//	public String getCustName() {
//		return custName;
//	}
//
//	public void setCustName(String custName) {
//		this.custName = custName;
//	}
//
//	public int getBill_Id() {
//		return bill_Id;
//	}
//
//	public void setBill_Id(int bill_Id) {
//		this.bill_Id = bill_Id;
//	}
//
//	public int getBill_amount() {
//		return bill_amount;
//	}
//
//	public void setBill_amount(int bill_amount) {
//		this.bill_amount = bill_amount;
//	}
//
//	public SalesReportEntity(int salesrepId, int custId, String custName, int bill_Id, int bill_amount) {
//		super();
//		this.salesrepId = salesrepId;
//		this.custId = custId;
//		this.custName = custName;
//		this.bill_Id = bill_Id;
//		this.bill_amount = bill_amount;
//	}
//
//	public SalesReportEntity() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String toString() {
//		return "SalesReportEntity [salesrepId=" + salesrepId + ", custId=" + custId + ", custName=" + custName
//				+ ", bill_Id=" + bill_Id + ", bill_amount=" + bill_amount + "]";
//	}
//	
//	
//	
//	
//
//}
