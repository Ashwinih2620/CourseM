package com.studio.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studio.entity.UserEntity;
import com.studio.exception.ResourceNotFoundException;
import com.studio.repository.UserRepository;
import com.studio.service.UserService;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	public UserRepository deoRepository;
	
	@Override
	public UserEntity addDeo(UserEntity deo) {
		// TODO Auto-generated method stub
		return this.deoRepository.save(deo);
	}

	@Override
	public List<UserEntity> getAlldeos() {
		// TODO Auto-generated method stub
		return this.deoRepository.findAll();
	}

	@Override
	public void deleteDeo(int deoId) {
		// TODO Auto-generated method stub
		
		UserEntity deo =  this.deoRepository.findById(deoId)
				.orElseThrow(
				()->new ResourceNotFoundException("Deo","DeoId",deoId));
		this.deoRepository.deleteById(deoId);
		
	}

	@Override
	public UserEntity checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		UserEntity obj = this.deoRepository.findByUsernameAndPassword(username, password);
		return obj;
	}

}
