package com.studio.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.studio.entity.UserEntity;
import com.studio.exception.ApiResponse;
import com.studio.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	// @RequestMapping(value = "/" , method = RequestMethod.POST)
	@PostMapping("/") // Mapping Handler
	public ResponseEntity<UserEntity> addDeo(@RequestBody UserEntity deo)
	{
		UserEntity newDeo = this.userService.addDeo(deo);
		
		return new ResponseEntity<UserEntity>(newDeo,HttpStatus.CREATED);
				
	}
	
	@GetMapping("/")
	public ResponseEntity<List<UserEntity>> getAllDeos()
	{
		List<UserEntity> alldeos = this.userService.getAlldeos();
		return new ResponseEntity<List<UserEntity>>(alldeos,HttpStatus.OK);
		
	}
	
	@GetMapping("/check")
	public UserEntity checkLogin (@RequestParam("username")String username , @RequestParam("password")String password)
	{
		//username="Vikas@123";
		//password="welcome";
		UserEntity login = this.userService.checkLogin(username, password);
		if(login!=null)
		{
			return login;
		}
		return  null;
		
	}
	
	@DeleteMapping("/{deoId}")
	public ResponseEntity<ApiResponse> deleteDeo(@PathVariable("deoId")  int deoId)
	{
		this.userService.deleteDeo(deoId);
		ApiResponse response = new ApiResponse();
		response.setMessage("Customer record is deleted successfully");
		response.setSuccess(false);
		return new ResponseEntity<ApiResponse>(response,HttpStatus.OK);
	}
	

}
