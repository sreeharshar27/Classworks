package com.htc.corejava.day4;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		String[] names = {"Anish", "Ravi", "Suresh", "Ajay"};
		int num = 300;
		try {
			System.out.println(names[2]);
		
			System.out.println(num/10);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie);
		}
		catch(Exception ex) {
			System.out.println("Error message: " + ex);
		}
		finally {
			System.out.println("Finally always executes");
		}
		System.out.println("Completed.");
	}
}
