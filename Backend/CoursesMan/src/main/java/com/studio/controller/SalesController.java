//package com.studio.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.studio.entity.SalaryEntity;
//import com.studio.entity.SalesEntity;
//import com.studio.service.SalaryService;
//import com.studio.service.SalesService;
//
//@RestController
//@RequestMapping("/sales")
//@CrossOrigin("*")
//public class SalesController {
//	
//	@Autowired
//	private SalesService salesService;
//	
//	@PostMapping("/") // Mapping Handler
//	public ResponseEntity<SalesEntity> addSales(@RequestBody SalesEntity sales)
//	{
//		SalesEntity newSales = this.salesService.addSales(sales);
//		
//		return new ResponseEntity<SalesEntity>(newSales,HttpStatus.CREATED);
//				
//	}
//
//}
