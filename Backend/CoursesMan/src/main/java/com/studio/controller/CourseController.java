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
import org.springframework.web.bind.annotation.RestController;

import com.studio.entity.CourseEntity;
import com.studio.exception.ApiResponse;
import com.studio.service.CourseService;




@RestController
@RequestMapping("/course")
@CrossOrigin("*")
public class CourseController {
	
	@Autowired
	private CourseService customerService;
	// @RequestMapping(value = "/" , method = RequestMethod.POST)
	@PostMapping("/") // Mapping Handler
	public ResponseEntity<CourseEntity> addCourse(@RequestBody CourseEntity customer)
	{
		CourseEntity newCustomer = this.customerService.addCourse(customer);
		
		return new ResponseEntity<CourseEntity>(newCustomer,HttpStatus.CREATED);
				
	}
	
	@GetMapping("/")
	public ResponseEntity<List<CourseEntity>> getAllCourses()
	{
		List<CourseEntity> allcustomers = this.customerService.getAllcourses();
		return new ResponseEntity<List<CourseEntity>>(allcustomers,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{customerId}")
	public ResponseEntity<ApiResponse> deleteCourse(@PathVariable("customerId")  int customerId)
	{
		this.customerService.deleteCourse(customerId);
		ApiResponse response = new ApiResponse();
		response.setMessage("Course record is deleted successfully");
		response.setSuccess(false);
		return new ResponseEntity<ApiResponse>(response,HttpStatus.OK);
	}
	

}
