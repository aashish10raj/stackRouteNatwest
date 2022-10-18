package com.stackroute.natwest.mdb.service;

import java.util.List;

import com.stackroute.natwest.mdb.model.Mobile;

public interface MobileService {
	public boolean addMobile(Mobile m);
	public List<Mobile> getMobiles();
	

}
