package com.studio.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studio.entity.CourseEntity;
import com.studio.exception.ResourceNotFoundException;
import com.studio.repository.CourseRepository;
import com.studio.service.CourseService;




@Service
public class CourseServiceImplementation implements CourseService {
	
	@Autowired
	public CourseRepository customerRepository;
	
	@Override
	public CourseEntity addCourse(CourseEntity customer) {
		// TODO Auto-generated method stub
		return this.customerRepository.save(customer);
	}

	@Override
	public List<CourseEntity> getAllcourses() {
		// TODO Auto-generated method stub
		return this.customerRepository.findAll();
	}

	@Override
	public void deleteCourse(int customerId) {
		// TODO Auto-generated method stub
		
		CourseEntity customer =  this.customerRepository.findById(customerId)
				.orElseThrow(
				()->new ResourceNotFoundException("Customer","CustomerId",customerId));
		this.customerRepository.deleteById(customerId);
		
	}

}
