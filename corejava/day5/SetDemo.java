package com.htc.corejava.day5;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> numset = new HashSet<>();
		numset.add(new Integer(100));
		numset.add(new Integer(200));
		numset.add(new Integer(300));
		numset.add(new Integer(400));
		numset.add(new Integer(200));
		
		for(Integer num : numset) {
			System.out.println(num);
		}
		//using iterator
		Iterator<Integer> itr = numset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
