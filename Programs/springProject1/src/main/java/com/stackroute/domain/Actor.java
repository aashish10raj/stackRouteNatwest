package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component("actor")
public class Actor {
	
	public String name;
	public String gender;
	public int age;
	
	public String getName() {
		return name;
	}
	
//	public Actor(String name, String gender, int age) {
//		super();
//		this.name = name;
//		this.gender = gender;
//		this.age = age;
//	}

	@Override
	public String toString() {
		return "Actor [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
