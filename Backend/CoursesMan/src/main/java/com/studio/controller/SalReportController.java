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
//import com.studio.entity.EmployeeEntity;
//import com.studio.entity.SalReportEntity;
//import com.studio.entity.SalesEntity;
//import com.studio.service.SalReportService;
//import com.studio.service.SalesService;
//
//@RestController
//@RequestMapping("/salaryreport")
//@CrossOrigin("*")
//public class SalReportController {
//	
//	@Autowired
//	private SalReportService salreportService;
//	
//	@GetMapping("/")
//	public ResponseEntity<List<SalReportEntity>> getAllSalReports()
//	{
//		List<SalReportEntity> allsalreports = this.salreportService.getAllsalreports();
//		return new ResponseEntity<List<SalReportEntity>>(allsalreports,HttpStatus.OK);
//		
//	}
//	
//	
//
//}
