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
//@Table(name="Sales")
//public class SalesEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // Make it Auto Increment
//	private int billId; //Make attribute Primary Key
//	
//	@Column(nullable = false,length=20)
//	private int custId;
//	
//	@Column(nullable = false,length=20)
//	private int bill_amount;
//
//	public int getBillId() {
//		return billId;
//	}
//
//	public void setBillId(int billId) {
//		this.billId = billId;
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
//	public int getBill_amount() {
//		return bill_amount;
//	}
//
//	public void setBill_amount(int bill_amount) {
//		this.bill_amount = bill_amount;
//	}
//
//	public SalesEntity(int billId, int custId, int bill_amount) {
//		super();
//		this.billId = billId;
//		this.custId = custId;
//		this.bill_amount = bill_amount;
//	}
//
//	public SalesEntity() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String toString() {
//		return "SalesEntity [billId=" + billId + ", custId=" + custId + ", bill_amount=" + bill_amount + "]";
//	}
//	
//	
//
//}
