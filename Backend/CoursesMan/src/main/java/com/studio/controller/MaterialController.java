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
//import com.studio.entity.MaterialEntity;
//import com.studio.service.CustomerService;
//import com.studio.service.MaterialService;
//
//@RestController
//@RequestMapping("/material")
//@CrossOrigin("*")
//public class MaterialController {
//	
//	@Autowired
//	private MaterialService materialService;
//	// @RequestMapping(value = "/" , method = RequestMethod.POST)
//	@PostMapping("/") // Mapping Handler
//	public ResponseEntity<MaterialEntity> addMaterial(@RequestBody MaterialEntity material)
//	{
//		MaterialEntity newMaterial = this.materialService.addMaterial(material);
//		
//		return new ResponseEntity<MaterialEntity>(newMaterial,HttpStatus.CREATED);
//				
//	}
//	
//	@GetMapping("/")
//	public ResponseEntity<List<MaterialEntity>> getAllMaterials()
//	{
//		List<MaterialEntity> allmaterials = this.materialService.getAllmaterials();
//		return new ResponseEntity<List<MaterialEntity>>(allmaterials,HttpStatus.OK);
//		
//	}
//
//}
