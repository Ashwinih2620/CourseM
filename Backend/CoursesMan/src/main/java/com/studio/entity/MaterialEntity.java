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
//@Table(name="Materials")
//public class MaterialEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // Make it Auto Increment
//	private int materialId; //Make attribute Primary Key
//	
//	@Column(nullable = false,length=20)
//	private String materialName;
//	
//	@Column(nullable = false,length=20)
//	private String stock;
//	
//	@Column(nullable = false,length=20)
//	private String price;
//
//	public int getMaterialId() {
//		return materialId;
//	}
//
//	public void setMaterialId(int materialId) {
//		this.materialId = materialId;
//	}
//
//	public String getMaterialName() {
//		return materialName;
//	}
//
//	public void setMaterialName(String materialName) {
//		this.materialName = materialName;
//	}
//
//	public String getStock() {
//		return stock;
//	}
//
//	public void setStock(String stock) {
//		this.stock = stock;
//	}
//
//	public String getPrice() {
//		return price;
//	}
//
//	public void setPrice(String price) {
//		this.price = price;
//	}
//
//	public MaterialEntity(int materialId, String materialName, String stock, String price) {
//		super();
//		this.materialId = materialId;
//		this.materialName = materialName;
//		this.stock = stock;
//		this.price = price;
//	}
//
//	public MaterialEntity() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String toString() {
//		return "MaterialEntity [materialId=" + materialId + ", materialName=" + materialName + ", stock=" + stock
//				+ ", price=" + price + "]";
//	}
//	
//	
//
//}
