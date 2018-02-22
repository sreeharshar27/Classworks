package com.htc.corejava.day3;

public class InheritanceTest {

	public static void main(String[] args) {
		//Employee e = new Manager();
		//Manager m = (Manager) new Employee(); //upcasting
		
		Manager m = new Manager(101,"Rahul", 5000.0, 2000.0, 3000.0);
		System.out.println(m.getEmployeeId());
		System.out.println(m.getProjectAllowance());
		//System.out.println(m.getSalary());
		
		System.out.println("===============================");
		
		Employee[] employees = new Employee[5];
		employees[0] = new Developer(101,"Rahul", 50000.0, 4000.0, 2500.0);
		employees[1] = new Developer(102,"Nelson", 50000.0, 4000.0, 2500.0);
		employees[2] = new Salesman(103,"Ramesh", 25000.0, 25000.0);
		employees[3] = new Developer(104,"Kishore", 29000.0, 2000.0, 1500.0);
		employees[4] = new Manager(105,"Ajay", 80000.0, 5000.0, 5000.0);
		
		Department dept = new Department("Sales", employees);
		System.out.println(dept.getEmployeeSalary(105));
		
		System.out.println(" ===================");
		//dept.getEmployees();
	}
}
