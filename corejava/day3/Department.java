package com.htc.corejava.day3;

import java.util.ArrayList;

public class Department {

	private String deptName;
	private Employee[] employees;
	
	public Department(String deptName, Employee[] employees) {
		super();
		this.deptName = deptName;
		this.employees = employees;
	}
	
	public double getEmployeeSalary(int employeeId) {		
		double salary = 0.0;
		
		for(Employee emp : employees) {
			if(emp.getEmployeeId() == employeeId) {
				salary = emp.getSalary();
				break;
			}
		}
		return salary;
	}
	
	/*public ArrayList<Employee> getEmployees() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		for(Employee emp : employees) {
			if(emp.getSalary() > 50000.0) {
				//System.out.println(emp.getEmployeeId() + "," + emp.getEmployeeName() + "," + emp.getSalary());
				empList.add(emp);
			}
		}
		return empList;
	}
	*/
	public double getTotalSalary() {
		double totalSalary = 0.0;
		for(Employee emp : employees) {
			totalSalary = totalSalary + emp.getSalary();
		}
		return totalSalary;
	}
	
}
