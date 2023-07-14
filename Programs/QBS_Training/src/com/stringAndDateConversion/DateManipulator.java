package com.stringAndDateConversion;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateManipulator {
	
	
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    
    public static Date stringToDate(String dateString) throws ParseException {
        return DATE_FORMAT.parse(dateString);
    }
    
    public static String dateToString(Date date) {
        return DATE_FORMAT.format(date);
    }
    
    public static long daysBetweenDates(Date startDate, Date endDate) {
        long diffInMillies = endDate.getTime() - startDate.getTime();
        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }

	public static void main(String[] args) {
		
		try {
            Date startDate = stringToDate("2022-01-01");
            Date endDate = stringToDate("2022-12-31");
            System.out.println("Start Date: " + dateToString(startDate));
            System.out.println("End Date: " + dateToString(endDate));
            System.out.println("Number of Days: " + daysBetweenDates(startDate, endDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }

	}

}
