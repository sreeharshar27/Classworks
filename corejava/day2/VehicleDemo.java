package com.htc.corejava.day2;

public class VehicleDemo {

	public static void main(String[] args) {
		
		//instantiation
		Vehicle v = new Vehicle();
		System.out.println(v.getRegistrationNo() + ", " + v.getMake() + ","+ v.getModel() + ","+ v.getYear());

		v.setRegistrationNo("reg0404200");
		v.setMake("Toyota");
		v.setModel("Corola");
		v.setYear(2015);
		v.setEngineno("eng3555sdf55632" );
		
		System.out.println(v.getRegistrationNo() + ", " + v.getMake() + ","+ v.getModel() + ","+ v.getYear());
		
		Vehicle v1 = new Vehicle();
		v1.setRegistrationNo("reg4555555");
		v1.setMake("TATA");
		v1.setModel("Indica");
		v1.setYear(2000);
		v1.setEngineno("eng10303003");
		
		System.out.println(v1.getRegistrationNo() + ", " + v1.getMake() + ","+ v1.getModel() + ","+ v1.getYear());
		
		Vehicle v2;
		v2 = v1;
		System.out.println(v2.getRegistrationNo() + ", " + v2.getMake() + ","+ v2.getModel() + ","+ v2.getYear());
	
		Vehicle v3 = new Vehicle("reg13444", "i20", "Honda", 2004, "ENG40404004");
		System.out.println(v3.getRegistrationNo() + ", " + v3.getMake() + ","+ v3.getModel() + ","+ v3.getYear());
		
	}
}
