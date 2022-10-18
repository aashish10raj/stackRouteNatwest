package com.stackroute.natwest.mdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.natwest.mdb.dao.MobileDAO;
import com.stackroute.natwest.mdb.model.Mobile;

@Service
public class MobileServiceImpl implements MobileService {
	@Autowired
	private MobileDAO dao;
	
	
	public boolean addMobile(Mobile m) {
		Mobile mobile=dao.insert(m);
		
		if(mobile !=null) {
			return true;
		}
		return false;
	}
	
	public List<Mobile> getMobiles(){
		return dao.findAll();
	}
 
}
