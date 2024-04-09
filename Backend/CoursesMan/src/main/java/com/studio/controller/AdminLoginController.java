package com.studio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.studio.entity.AdminLoginEntity;
import com.studio.service.AdminLoginService;

@RequestMapping("/adminlogin")
@RestController
@CrossOrigin("*")
public class AdminLoginController {
	
	@Autowired
	private AdminLoginService adminLoginService;
	
	@PostMapping("/") // Mapping Handler
	public ResponseEntity<AdminLoginEntity> addStudent(@RequestBody AdminLoginEntity adminlogin)
	{
		AdminLoginEntity newAdminLogin = this.adminLoginService.addAdminLogin(adminlogin);
		
		return new ResponseEntity<AdminLoginEntity>(newAdminLogin,HttpStatus.CREATED);
				
	}
	
	@GetMapping("/check1")
	public AdminLoginEntity checkAdminLogin (@RequestParam("user")String user , @RequestParam("pass")String pass)
	{
		//user="Shreejit";
		//pass="123456";
		AdminLoginEntity login = this.adminLoginService.checkAdminLogin(user, pass);
		if(login!=null)
		{
			return login;
		}
		
		return null;
		
	}
	
	

}
