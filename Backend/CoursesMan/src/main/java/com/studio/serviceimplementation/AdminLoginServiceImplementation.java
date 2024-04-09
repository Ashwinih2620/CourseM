package com.studio.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.studio.entity.AdminLoginEntity;
import com.studio.repository.AdminLoginRepository;
import com.studio.service.AdminLoginService;


@Service
public class AdminLoginServiceImplementation implements AdminLoginService {
	
	@Autowired
	public AdminLoginRepository adminloginRepository;

	@Override
	public AdminLoginEntity addAdminLogin(AdminLoginEntity adminlogin) {
		// TODO Auto-generated method stub
		return this.adminloginRepository.save(adminlogin);
	}

	@Override
	public AdminLoginEntity checkAdminLogin(String user, String pass) {
		// TODO Auto-generated method stub
		AdminLoginEntity obj1 = this.adminloginRepository.findByUserAndPass(user, pass);
		return obj1;
	}
	
	
	

}
