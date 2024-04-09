package com.studio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

 

import com.studio.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>
{
	public UserEntity findByUsernameAndPassword(String username , String password);

}
