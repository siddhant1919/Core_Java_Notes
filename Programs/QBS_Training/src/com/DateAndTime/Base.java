package com.DateAndTime;

import java.util.Date;

public class Base {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());   //millisecond past 1 jan 1970
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getMonth());
		
		

	}

}
