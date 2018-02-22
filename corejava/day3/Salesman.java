package com.htc.corejava.day3;

public class Salesman extends Employee {

	private double commission;
	
	public Salesman(){	
	}
	
	public Salesman(int employeeId, String employeeName, double salary, double commission) {
		super(employeeId, employeeName, salary);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getSalary() {
		System.out.println("calling salesman salary");
		return super.getSalary() + getCommission();
	}

}
