package com.htc.corejava.day3;

public class Developer extends Employee {

	private double overtimeAllowance;
	private double nightShiftAllowance;	
	
	public Developer(int employeeId, String employeeName, double salary, double overtimeAllowance, double nightShiftAllowance) {
		super(employeeId, employeeName, salary);
		this.overtimeAllowance = overtimeAllowance;
		this.nightShiftAllowance = nightShiftAllowance;
	}

	public double getOvertimeAllowance() {
		return overtimeAllowance;
	}

	public void setOvertimeAllowance(double overtimeAllowance) {
		this.overtimeAllowance = overtimeAllowance;
	}

	public double getNightShiftAllowance() {
		return nightShiftAllowance;
	}

	public void setNightShiftAllowance(double nightShiftAllowance) {
		this.nightShiftAllowance = nightShiftAllowance;
	}
	
	public double getSalary() {
		return super.getSalary() + getNightShiftAllowance() + getOvertimeAllowance();
	}
	
}
