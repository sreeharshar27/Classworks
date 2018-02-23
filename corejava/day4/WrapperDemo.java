package com.htc.corejava.day4;

public class WrapperDemo {

	public static void main(String[] args) {
		
		Integer intObj = new Integer(100);
		Long longObj = new Long(2000L);
		
		System.out.println(intObj.intValue());
		System.out.println(longObj.longValue());
		
		Integer obj =  300; //auto-boxing
		int value = obj;  //auto-unboxing
		
		intObj++;
		System.out.println(intObj);
	}
}
