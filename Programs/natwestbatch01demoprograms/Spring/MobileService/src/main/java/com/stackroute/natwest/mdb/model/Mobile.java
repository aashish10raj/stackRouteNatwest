package com.stackroute.natwest.mdb.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document	
public class Mobile {
	@Id
	private int mobileId;
	private String mobileName;
	private User user;
	private List<Sim> sim;
	
	public Mobile() {
		super();
	}

	public Mobile(int mobileId, String mobileName, User user, List<Sim> sim) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.user = user;
		this.sim = sim;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Sim> getSim() {
		return sim;
	}

	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", user=" + user + ", sim=" + sim + "]";
	}
}
