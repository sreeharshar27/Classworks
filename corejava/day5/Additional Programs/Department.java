package com.htc.corejava.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Department {

	private String deptName;
	private Set<Employee> employees = new HashSet<Employee>(); //HashSet is a Set.
	
	public Department(){
	}
	
	public Department(String deptName){
		this.deptName = deptName;
	}

	//Add an employee to dept.
	public boolean addEmployee(Employee emp) {
		return employees.add(emp);  //Emp is added to set. Duplicates will be rejected and returns false;
	}
	
	//fetch an employee from dept.
	public Employee getEmployee(int employeeId){
		Employee emp = null;
		for(Employee e : this.employees) {
			if(e.getEmployeeId() == employeeId) {
				emp = e;
				break;
			}
		}
		return emp;
	}
	//Remove an employeee
	public boolean removeEmployee(int employeeId) {
		Employee emp = getEmployee(employeeId);
		if(emp!=null)  //means, employee not found.
			return employees.remove(emp);  //must override equals and hashCode method in Employee class, for this to work.
		else
			return false;
	}
	
	public List<Employee> getAllEmployees(){
		ArrayList<Employee> empList = new ArrayList<Employee>(this.employees); //Converting Set to List.
		return empList;
	}
	//Overloaded method
	public List<Employee> getAllEmployees(String job){
		ArrayList<Employee> empList = new ArrayList<Employee>();
		for(Employee e: this.employees) {
			if(e.getJob().equals(job)){
				empList.add(e);   // Add employee with the given job to the list.
			}
		}
		return empList;
	}

}
