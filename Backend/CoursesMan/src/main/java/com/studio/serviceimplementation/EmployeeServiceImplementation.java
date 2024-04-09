//package com.studio.serviceimplementation;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.studio.entity.CustomerEntity;
//import com.studio.entity.EmployeeEntity;
//import com.studio.exception.ResourceNotFoundException;
//import com.studio.repository.CustomerRepository;
//import com.studio.repository.EmployeeRepository;
//import com.studio.service.CustomerService;
//import com.studio.service.EmployeeService;
//
//@Service
//public class EmployeeServiceImplementation implements EmployeeService {
//	
//	
//	@Autowired
//	public EmployeeRepository employeeRepository;
//	
//	@Override
//	public EmployeeEntity addEmployee(EmployeeEntity employee) {
//		// TODO Auto-generated method stub
//		return this.employeeRepository.save(employee);
//	}
//
//	@Override
//	public List<EmployeeEntity> getAllemployees() {
//		// TODO Auto-generated method stub
//		return this.employeeRepository.findAll();
//	}
//
//	@Override
//	public void deleteEmployee(int employeeId) {
//		// TODO Auto-generated method stub
//		
//		EmployeeEntity employee =  this.employeeRepository.findById(employeeId)
//				.orElseThrow(
//				()->new ResourceNotFoundException("Employee","EmployeeId",employeeId));
//		this.employeeRepository.deleteById(employeeId);
//		
//	}
//
//}
