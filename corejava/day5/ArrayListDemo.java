package com.htc.corejava.day5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Generics
		ArrayList<String> nameList = new ArrayList<String>();
		//LinkedList<String> nameList = new LinkedList<String>();
		//Vector<String> nameList = new Vector<String>();
		
		nameList.add("Ravi");
		nameList.add("Suresh");
		nameList.add("Ajay");
		nameList.add("Kishore");
		
		//Using index
		for(int i=0;i<nameList.size();i++) {
			System.out.println(nameList.get(i));
		}
		System.out.println(nameList.isEmpty());
		System.out.println(nameList.remove(0));
		System.out.println(nameList.remove("Ajay"));
		System.out.println(nameList.contains("Ajay"));
		
		//enhanced for loop
		for(String name :  nameList) {
			System.out.println(name);
		}
		//Using Iterator
		Iterator<String> itr = nameList.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
	}
}
