package com.studio.service;

import java.util.List;


import com.studio.entity.UserEntity;

public interface UserService {
	
	public UserEntity addDeo(UserEntity deo);
	
	public List<UserEntity> getAlldeos();
	
	public void deleteDeo(int deoId);
	
	public UserEntity checkLogin(String username , String password);

}
