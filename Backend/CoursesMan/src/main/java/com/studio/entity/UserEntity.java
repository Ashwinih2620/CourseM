package com.studio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Make it Auto Increment
	private int userId; //Make attribute Primary Key
	
	@Column(nullable = false,length=20)
	private String username;
	
	@Column(nullable = false,length=20)
	private String password;
	
	@Column(nullable = false,length=20)
	private String mobile;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEntity(int userId, String username, String password, String mobile) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "CustomerEntity [userId=" + userId + ", username=" + username + ", password=" + password + ", mobile="
				+ mobile + "]";
	}

	
		

}
