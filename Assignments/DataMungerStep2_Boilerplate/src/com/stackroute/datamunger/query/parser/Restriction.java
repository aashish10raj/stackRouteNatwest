package com.stackroute.datamunger.query.parser;

/*
 * This class is used for storing name of field, condition and value for 
 * each conditions
 * generate getter and setter for this class,
 * Also override toString method
 * */

public class Restriction {
	String name;
	String value;
	String condition;

	// Write logic for constructor
	public Restriction(String name, String value, String condition) {
		super();
		this.name = name;
		this.condition = condition;
		this.value = value;
	}
	public Restriction()
	{
		super();
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getCondition() {
		return condition;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Restriction{" +
				"name='" + name + '\'' +
				", value='" + value + '\'' +
				", condition='" + condition + '\'' +
				'}';

	}

}