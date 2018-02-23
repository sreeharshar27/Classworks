package com.htc.corejava.day4;

public class ExceptionDemo2 {

	public int divide(int num, int dm)throws ArithmeticException {
		int result = num/dm;
		return result;
	}
	
	public String getName(int index)  throws ArrayIndexOutOfBoundsException{
		String[] names = {"Anish", "Ravi", "Suresh", "Ajay"};
		String name = names[index];
		return name;
	}
	
	public boolean searchName(String name) throws NameNotFoundException{
		boolean found = false;
		String[] names = {"Anish", "Ravi", "Suresh", "Ajay"};
		for(String nm : names) {
			if(nm.equals(name)) {
				found = true;
				break;
			}
		}
		if(!found)
			throw new NameNotFoundException();
		return found;
	}
	
	
	public static void main(String[] args) {
		
		ExceptionDemo2 exdemo = new ExceptionDemo2();
		System.out.println(exdemo.getName(5));
		System.out.println(exdemo.divide(400, 0));

			try {
				exdemo.searchName("Ajay");
			} catch (NameNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
