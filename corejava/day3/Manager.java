package com.htc.corejava.day3;

public class Manager extends Employee {

	private double projectAllowance;
	private double travelAllowance;
	
	public Manager(){
		super();
		System.out.println("Child class default");
	}
	
	public Manager(int employeeId, String employeeName, double salary, double projectAllowance, double travelAllowance) {
		super(employeeId, employeeName, salary);
		this.projectAllowance = projectAllowance;
		this.travelAllowance = travelAllowance;
	}

	public double getProjectAllowance() {
		return projectAllowance;
	}

	public void setProjectAllowance(double projectAllowance) {
		this.projectAllowance = projectAllowance;
	}

	public double getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}
	
	public double getSalary() {  //overriding method
		System.out.println("calling manager slary");
		return super.getSalary() + this.getProjectAllowance() + getTravelAllowance();
	}
}
