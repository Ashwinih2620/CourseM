package com.studio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminLoginEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int AdminId; //Make attribute Primary Key
	
	
	private String user;
	
	
	private String pass;
	
	


	public int getAdminId() {
		return AdminId;
	}


	public void setAdminId(int adminId) {
		AdminId = adminId;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public AdminLoginEntity(int adminId, String user, String pass) {
		super();
		AdminId = adminId;
		this.user = user;
		this.pass = pass;
	}


	public AdminLoginEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "AdminLoginEntity [AdminId=" + AdminId + ", user=" + user + ", pass=" + pass + "]";
	}

	
	

}
