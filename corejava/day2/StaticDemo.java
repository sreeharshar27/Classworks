package com.htc.corejava.day2;

public class StaticDemo {

	private int nonStaticField;
	private static int staticField;
	
	public StaticDemo() {
		
	}
	
	public void incrementData() {
		nonStaticField++;
		staticField++;
	}
	
	public void showData() {
		System.out.println("Non static field:" + nonStaticField);
		System.out.println("Static field:" + staticField);
	}
	
	public int getNonStaticField() {
		return nonStaticField;
	}

	public static int getStaticData() {
		return staticField;
	}
	
	public static void main(String [] args) {
		StaticDemo st1 = new StaticDemo();
		st1.incrementData();
		System.out.println(st1.getNonStaticField());
		System.out.println(StaticDemo.getStaticData());
		
		System.out.println("===========================");
		StaticDemo st2 = new StaticDemo();
		st2.incrementData();
		System.out.println(st2.getNonStaticField());
		System.out.println(StaticDemo.getStaticData());
		
		System.out.println("===========================");
		StaticDemo st3 = new StaticDemo();
		st3.incrementData();
		System.out.println(st1.getNonStaticField());
		System.out.println(StaticDemo.getStaticData());


	}
}
