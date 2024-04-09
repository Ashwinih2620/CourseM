//package com.studio.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.studio.entity.CustomerEntity;
//import com.studio.entity.SalaryEntity;
//import com.studio.service.CustomerService;
//import com.studio.service.SalaryService;
//
//@RestController
//@RequestMapping("/salary")
//@CrossOrigin("*")
//public class SalaryController {
//	
//	@Autowired
//	private SalaryService salaryService;
//	
//	@PostMapping("/") // Mapping Handler
//	public ResponseEntity<SalaryEntity> addSalary(@RequestBody SalaryEntity salary)
//	{
//		SalaryEntity newSalary = this.salaryService.addSalary(salary);
//		
//		return new ResponseEntity<SalaryEntity>(newSalary,HttpStatus.CREATED);
//				
//	}
//	
//	@GetMapping("/")
//	public ResponseEntity<List<SalaryEntity>> getAllSalaries()
//	{
//		List<SalaryEntity> allsalaries = this.salaryService.getAllsalaries();
//		return new ResponseEntity<List<SalaryEntity>>(allsalaries,HttpStatus.OK);
//		
//	}
//
//}
