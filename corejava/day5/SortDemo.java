package com.htc.corejava.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

import com.htc.corejava.day2.Vehicle;

public class SortDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
		nums.add(230);
		nums.add(500);
		nums.add(100);
		nums.add(780);
		
		for(Integer num : nums) {
			System.out.println(num);
		}
		
		//==========================
		
		TreeSet<Vehicle> vehicles = new TreeSet<Vehicle>();
		
		vehicles.add(new Vehicle("r40505","i20","Honda", 2010,"Eng3030303"));
		vehicles.add(new Vehicle("r40506","A7","Audi", 2012,"Eng3030555"));
		vehicles.add(new Vehicle("r40507","mmd3","Honda", 2017,"Eng3030666"));
		vehicles.add(new Vehicle("r40508","tt","TATA", 2018,"Eng3030999"));
		
		for(Vehicle v : vehicles) {
			System.out.println(v);
		}
		
		TreeSet<Vehicle> vehicles2 = new TreeSet<>(new Comparator<Vehicle>() {

			
			public int compare(Vehicle o1, Vehicle o2) {
				// TODO Auto-generated method stub
				return o1.getMake().compareTo(o2.getMake());
			}
			
		});
		
		System.out.println(" ======================");
		vehicles2.add(new Vehicle("r40505","i20","Honda", 2010,"Eng3030303"));
		vehicles2.add(new Vehicle("r40506","A7","Audi", 2012,"Eng3030555"));
		vehicles2.add(new Vehicle("r40507","mmd3","BMW", 2017,"Eng3030666"));
		vehicles2.add(new Vehicle("r40508","tt","TATA", 2018,"Eng3030999"));
		for(Vehicle v : vehicles2) {
			System.out.println(v);
		}
		
		
		ArrayList<Vehicle> vehList = new ArrayList<Vehicle>();
		vehList.add(new Vehicle("r40505","i20","Honda", 2010,"Eng3030303"));
		vehList.add(new Vehicle("r40506","A7","Audi", 2012,"Eng3030555"));
		vehList.add(new Vehicle("r40507","mmd3","BMW", 2017,"Eng3030666"));
		vehList.add(new Vehicle("r40508","tt","TATA", 2018,"Eng3030999"));
		
		Collections.sort(vehList);
		
		for(Vehicle v3 : vehList) {
			System.out.println(v3);
		}

		
		Collections.sort(vehList, new Comparator<Vehicle>() {

			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				// TODO Auto-generated method stub
				return o1.getMake().compareTo(o2.getMake());
			}
			
		});
		
		for(Vehicle v3 : vehList) {
			System.out.println(v3);
		}

	}
}
