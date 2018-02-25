package com.htc.corejava.day5;

//Dependent classes for this program
// Department.java,  Employee.java

public class DepartmentTest {

	public static void main(String[] args) {
		
		Department dept = new Department("Projects");
		dept.addEmployee(new Employee(101,"Rahul", 45000.0, "Trainer", "Male"));
		dept.addEmployee(new Employee(102,"Ramesh", 79000.0, "Manager", "Male"));
		dept.addEmployee(new Employee(103,"Ajay", 25000.0, "Developer", "Male"));
		dept.addEmployee(new Employee(104,"Anand", 35000.0, "Tester", "Male"));
		dept.addEmployee(new Employee(105,"Kirthi", 55000.0, "Developer", "FeMale"));
		
		for(Employee emp : dept.getAllEmployees() ){
			System.out.println(emp);
		}
		System.out.println("==============================================================");
		
		Employee emp = dept.getEmployee(105);
		System.out.println(emp);
		System.out.println("==============================================================");
		
		boolean result = dept.removeEmployee(105);
		System.out.println("Deleted:"+ result);
		System.out.println("==============================================================");

		Employee emp2 = dept.getEmployee(105);
		System.out.println(emp2);
		System.out.println("==============================================================");
		
		for(Employee e : dept.getAllEmployees("Developer")){
			System.out.println(emp);
		}
	}
}
