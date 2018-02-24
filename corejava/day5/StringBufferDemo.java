package com.htc.corejava.day5;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer buf = new StringBuffer();  //mutable container for chars
		
		buf.append("No-17,");
		buf.append("Ramanar Street,");
		buf.append("Tambaram,");
		buf.append("Chennai-45,");
		buf.append("Tamilnadu,");

		
		System.out.println(buf.toString());
	}
	
}
