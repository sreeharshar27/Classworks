package com.htc.corejava.day5;

public class StringDemo {

	public static void main(String[] args) {
		
		String line = "This is a line to  test String class functions. This is is a simple test.";
		
		System.out.println("Character at: " + line.charAt(0));
		
		System.out.println("Upper case: " + line.toUpperCase());
		
		System.out.println("Lower case: " + line.toLowerCase());
		
		System.out.println("Index of: " + line.indexOf("String"));
		
		System.out.println("Last Index of: " + line.lastIndexOf("This"));
		
		System.out.println("Substring: " + line.substring(0,5 ));
		
		System.out.println("Length: " + line.length());
		
		System.out.println("Spliting strings");
		
		String[] words = line.split(" ");
		for(String word : words) {
			System.out.print(word + " , ");
		}
		
		
	}
}
