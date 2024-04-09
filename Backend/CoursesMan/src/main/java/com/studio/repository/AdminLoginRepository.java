package com.studio.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.studio.entity.AdminLoginEntity;

public interface AdminLoginRepository extends JpaRepository<AdminLoginEntity , Integer> 

{
	
	public AdminLoginEntity findByUserAndPass(String user , String pass);

}
