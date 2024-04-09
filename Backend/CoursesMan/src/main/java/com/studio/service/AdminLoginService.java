package com.studio.service;

import org.springframework.stereotype.Service;

import com.studio.entity.AdminLoginEntity;



@Service
public interface AdminLoginService {
	
	// Add adminlogin
		public AdminLoginEntity addAdminLogin(AdminLoginEntity adminlogin);
		
		public AdminLoginEntity checkAdminLogin(String user , String pass);
		
		

}
