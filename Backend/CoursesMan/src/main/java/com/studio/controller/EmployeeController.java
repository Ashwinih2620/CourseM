//package com.studio.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.studio.entity.CustomerEntity;
//import com.studio.entity.EmployeeEntity;
//import com.studio.exception.ApiResponse;
//import com.studio.service.CustomerService;
//import com.studio.service.EmployeeService;
//
//@RestController
//@RequestMapping("/employee")
//@CrossOrigin("*")
//public class EmployeeController {
//	
//	@Autowired
//	private EmployeeService employeeService;
//	// @RequestMapping(value = "/" , method = RequestMethod.POST)
//	@PostMapping("/") // Mapping Handler
//	public ResponseEntity<EmployeeEntity> addCustomer(@RequestBody EmployeeEntity employee)
//	{
//		EmployeeEntity newEmployee = this.employeeService.addEmployee(employee);
//		
//		return new ResponseEntity<EmployeeEntity>(newEmployee,HttpStatus.CREATED);
//				
//	}
//	
//	@GetMapping("/")
//	public ResponseEntity<List<EmployeeEntity>> getAllEmployees()
//	{
//		List<EmployeeEntity> allemployees = this.employeeService.getAllemployees();
//		return new ResponseEntity<List<EmployeeEntity>>(allemployees,HttpStatus.OK);
//		
//	}
//	
//	@DeleteMapping("/{employeeId}")
//	public ResponseEntity<ApiResponse> deleteEmployee(@PathVariable("employeeId")  int employeeId)
//	{
//		this.employeeService.deleteEmployee(employeeId);
//		ApiResponse response = new ApiResponse();
//		response.setMessage("Customer record is deleted successfully");
//		response.setSuccess(false);
//		return new ResponseEntity<ApiResponse>(response,HttpStatus.OK);
//	}
//
//}
