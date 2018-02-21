package com.htc.corejava.day2;

public class ParameterPassDemo2 {

	public void increment(int num) {
		num++;
		System.out.println("Inside icrement: "+ num);
		return;
	}
	
	public static void main(String[] args) {
		
		int num = 100;
		System.out.println("Inside main before:" + num);
		
		ParameterPassDemo2 demo = new ParameterPassDemo2();
		demo.increment(num);
		
		System.out.println("Inside main after:" + num);
	}
}
