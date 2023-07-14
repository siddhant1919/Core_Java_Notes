package com.DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormater {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String myDate = dt.format(dtf);
		System.out.println(myDate);

	}

}
