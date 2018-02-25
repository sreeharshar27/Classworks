package com.htc.corejava.day5;

public class Employee implements Comparable<Employee>{

	private int employeeId;
	private String empname;
	private double salary;
	private String job;
	private String gender;
	
	public Employee(){
		
	}

	public Employee(int employeeId, String empname, double salary, String job, String gender) {
		super();
		this.employeeId = employeeId;
		this.empname = empname;
		this.salary = salary;
		this.job = job;
		this.gender = gender;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	//hashCode and equals generated using employeeId and empname;
	//Means, if employeeId and empname are same, objects are identical.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empname=" + empname + ", salary=" + salary + ", job=" + job
				+ ", gender=" + gender + "]";
	}

	//Default ordering is based on employeeId basis
	@Override
	public int compareTo(Employee emp) {
		Integer o1 = new Integer(this.employeeId);
		Integer o2 = new Integer(emp.employeeId);
		return o1.compareTo(o2);
	}
	
	
}
