package com.DateAndTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderClass {

	public static void main(String[] args) {
		
//		Calendar is an abstract class, but we can get its instnce by getInstance() 
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTimeZone());
		System.out.println(c.getTime());
		System.out.println(c.DATE);
		System.out.println(c.HOUR);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.isLeapYear(2020));
		
		

	}

}
