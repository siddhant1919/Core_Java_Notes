package com.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {


	public static void main(String[] args) {
		
//		Set<Integer> s = new HashSet();
//		s.add(55);
//		s.add(1);
//		s.add(80);
//		s.add(55);
//		s.add(3);
//		
//		System.out.println(s);
//	
//		s.remove(1);
//		System.out.println(s);
//		
//		System.out.println(s.contains(80));
//		--------------------------------------------------------------
//		
//		Set<Integer> s1 = new LinkedHashSet();
//		s1.add(55);
//		s1.add(1);
//		s1.add(80);
//		s1.add(55);
//		s1.add(3);
//		s1.add(60); 
//		
//		System.out.println(s1);
//	
//		s1.remove(1);
//		System.out.println(s1);
//		
//		System.out.println(s1.contains(80));
//		-------------------------------------------------------------------
		
		Set<Integer> ts = new TreeSet<>();
		
		ts.add(55);
		ts.add(1);
		ts.add(80);
		ts.add(55);
		ts.add(3);
		ts.add(60); 
		
		System.out.println(ts);
	
		ts.remove(1);
		System.out.println(ts);
		
		System.out.println(ts.contains(80));
		

	}

}
