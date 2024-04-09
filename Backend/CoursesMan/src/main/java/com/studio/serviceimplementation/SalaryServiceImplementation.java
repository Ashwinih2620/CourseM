//package com.studio.serviceimplementation;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.studio.entity.CustomerEntity;
//import com.studio.entity.SalaryEntity;
//import com.studio.repository.CustomerRepository;
//import com.studio.repository.SalaryRepository;
//import com.studio.service.CustomerService;
//import com.studio.service.SalaryService;
//
//@Service
//public class SalaryServiceImplementation implements SalaryService{
//	
//	@Autowired
//	public SalaryRepository salaryRepository;
//
//	@Override
//	public SalaryEntity addSalary(SalaryEntity salary) {
//		// TODO Auto-generated method stub
//		return this.salaryRepository.save(salary);
//	}
//
//	@Override
//	public List<SalaryEntity> getAllsalaries() {
//		// TODO Auto-generated method stub
//		return this.salaryRepository.findAll();
//	}
//
//	
//
//}
