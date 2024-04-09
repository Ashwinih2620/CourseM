//package com.studio.serviceimplementation;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.studio.entity.CustomerEntity;
//import com.studio.entity.MaterialEntity;
//import com.studio.repository.CustomerRepository;
//import com.studio.repository.MaterialRepository;
//import com.studio.service.CustomerService;
//import com.studio.service.MaterialService;
//
//@Service
//public class MaterialServiceImplementation implements MaterialService {
//	
//	@Autowired
//	public MaterialRepository materialRepository;
//	
//	@Override
//	public MaterialEntity addMaterial(MaterialEntity material) {
//		// TODO Auto-generated method stub
//		return this.materialRepository.save(material);
//	}
//
//	@Override
//	public List<MaterialEntity> getAllmaterials() {
//		// TODO Auto-generated method stub
//		return this.materialRepository.findAll();
//	}
//
//}
