package com.htc.corejava.day5;

import java.util.HashSet;

import com.htc.corejava.day2.Vehicle;

public class CollectionDemo {

	public static void main(String[] args) {
		
		HashSet<Vehicle> vehicles = new HashSet<Vehicle>();
		
		vehicles.add(new Vehicle("r40505","i20","Honda", 2010,"Eng3030303"));
		vehicles.add(new Vehicle("r40506","A7","Audi", 2012,"Eng3030555"));
		vehicles.add(new Vehicle("r40507","mmd3","BMW", 2017,"Eng3030666"));
		vehicles.add(new Vehicle("r40508","tt","TATA", 2018,"Eng3030999"));
		
		vehicles.add(new Vehicle("r40508","tt","TATA", 2018,"Eng3030999"));
		
		for(Vehicle v : vehicles) {
			System.out.println(v);
		}
		
		if(vehicles.contains(new Vehicle("r40506","A6","Audi", 2012,"Eng3030555")))
			System.out.println("Vehicle found");
		else
			System.out.println(" Vehicle not found");
		
	}
}
