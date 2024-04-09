//package com.studio.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.studio.entity.SalReportEntity;
//import com.studio.entity.SalesReportEntity;
//import com.studio.service.SalReportService;
//import com.studio.service.SalesReportService;
//
//@RestController
//@RequestMapping("/salesreport")
//@CrossOrigin("*")
//public class SalesReportController {
//	
//	@Autowired
//	private SalesReportService salesreportService;
//	
//	@GetMapping("/")
//	public ResponseEntity<List<SalesReportEntity>> getAllSalesReports()
//	{
//		List<SalesReportEntity> allsalesreports = this.salesreportService.getAllsalesreports();
//		return new ResponseEntity<List<SalesReportEntity>>(allsalesreports,HttpStatus.OK);
//		
//	}
//
//}
