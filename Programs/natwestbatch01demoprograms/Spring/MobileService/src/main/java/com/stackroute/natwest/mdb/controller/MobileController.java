package com.stackroute.natwest.mdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.natwest.mdb.model.Mobile;
import com.stackroute.natwest.mdb.service.MobileService;

@RestController
@RequestMapping("/api/v1/mobile")
public class MobileController {
	@Autowired
	private MobileService service;
	
	ResponseEntity response;
	boolean flag;
	
	@PostMapping
	public ResponseEntity<?> addMobile(@RequestBody Mobile mobile){
		
		flag= service.addMobile(mobile);
		
		if(flag) {
			response= new ResponseEntity<String>("Mobile Object Created", HttpStatus.CREATED);
		}else {
			response= new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	@GetMapping
	public ResponseEntity<?> getMobiles(){
		
		List<Mobile> mobileList=service.getMobiles();
		
		if(mobileList !=null) {
			response= new ResponseEntity<List<Mobile>>(mobileList, HttpStatus.CREATED);
		}else {
			response= new ResponseEntity<String>("Failure", HttpStatus.CONFLICT);
		}
		return response;
	}

}
