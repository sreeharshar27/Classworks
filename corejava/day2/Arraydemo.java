package com.htc.corejava.day2;

public class Arraydemo {

	
	public static void main(String[] args) {
		
		//int[] number = new int[5];
		int[] numbers = {100, 200, 300, 400, 500};
		
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+ " ,");
			
		}
		
		System.out.println("\nUsing enhanced for loop\n");
		//enhanced for loop
		for(int element : numbers) {
			System.out.print(element + ",");
		}
		
		int n = 3;
		System.out.println("\n"+ numbers[n]);
		
	}
}
