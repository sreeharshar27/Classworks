package com.htc.corejava.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "India");
		hm.put(2,"South Africa");
		hm.put(3, "Australia");
		
		hm.put(2, "Srilanka");
		
		
		//using keyset
		Set<Integer> keys = hm.keySet();
		for(Integer key : keys) {
			System.out.println(key + "--" + hm.get(key));
		}
		
		
		//using entry set
		Set<Map.Entry<Integer,String>> entries = hm.entrySet();
		for(Map.Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + "==" + entry.getValue());
		}
		
		
		System.out.println(hm.get(1));
		
		System.out.println(hm.containsValue("India"));
		System.out.println(hm.containsKey(1));
	}
}
