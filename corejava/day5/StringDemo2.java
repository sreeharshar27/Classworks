package com.htc.corejava.day5;

public class StringDemo2 {

	public static void main(String[] args) {
		
		//String s1 = new String("HTC");
		//String s2 = new String("HTC");
		
		String s1 = "HTC";  // STRING POOL
		String s2 = "HTC";
		if(s1 == s2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equals");
		}
		
		if(s1.equals(s2)) {
			System.out.println("equals");
		}
				
	}
}
