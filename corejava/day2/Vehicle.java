package com.htc.corejava.day2;

public class Vehicle {
	// attributes, instance variables, data members
	private String registrationNo;
	private String model;
	private String make;
	private int year;
	private String engineno;
	

	public Vehicle() {  //default constructor
		
	}
	//parameterized constructor
	public Vehicle(String registrationNo, String model, String make, int year, String engineno) {
		super();
		this.registrationNo = registrationNo;
		this.model = model;
		this.make = make;
		this.year = year;
		this.engineno = engineno;
	}
	//methods, member function
	// getter and setter methods.
	public String getRegistrationNo() {
		return this.registrationNo;
	}
	public void setRegistrationNo (String regno) {
		registrationNo = regno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getEngineno() {
		return engineno;
	}
	public void setEngineno(String engineno) {
		this.engineno = engineno;
	}
	
}

