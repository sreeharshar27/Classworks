package com.htc.corejava.day1;

public class ExceptionChainDemo {

	public String getName(int index) {
		
		String[] names = {"Ravi", "Suresh", "Ajay", "Anand"};
		try {
			String name = names[index];
			return name;
		}
		catch(ArrayIndexOutOfBoundsException aix) {
			
			IllegalArgumentException argEx = new IllegalArgumentException(" Wrong index" + index);
			aix.initCause(argEx); //set the reason for exception
			throw aix; //rethrowing
		}
	}
	
	public static void main(String[] args) {
		
		ExceptionChainDemo exdemo = new ExceptionChainDemo();
		try {
			
			String name = exdemo.getName(-1);
			System.out.println(name);
		}
		catch(Exception ex) {
			System.out.println("Exception Occured: " + ex);
			System.out.println("Reason for exception: " + ex.getCause()); // Reason for exception
		}
	}
}
