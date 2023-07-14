package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
//		Map<String, Integer> hm = new HashMap<>();
//		hm.put("one", 1);
//		hm.put("two", 1);
//		hm.put("three", 3);
//		hm.put("fourth", 4);
//		hm.put("fifth", 5);
//		hm.put("sixth", 6);
//		hm.put("sixth", 23);
//		hm.putIfAbsent("sixth", 20);
//		
//		System.out.println(hm);
//		System.out.println(hm.containsKey("fourth"));
//		--------------------------------------------------------------------
		
		Map<Integer,String> hm = new TreeMap<>();
		hm.put(4,"one");
		hm.put(1,"two");
		hm.put(8,"three");
		hm.put(9,"fourth");
		hm.put(2,"fifth");
		hm.put(33,"sixth");
		hm.put(3,"sixth");
				
		System.out.println(hm);
		System.out.println(hm.containsKey(9));
		
		
		

	}

}
