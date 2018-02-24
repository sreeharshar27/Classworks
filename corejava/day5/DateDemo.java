package com.htc.corejava.day5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.getTime());
		
		// Jan 1st 1970
		
		GregorianCalendar gc = new GregorianCalendar();
		Date today = gc.getTime();
		System.out.println(today);
		
		System.out.println("calendar fields");
		System.out.println("Year:" + gc.get(Calendar.YEAR));
		System.out.println("Month:" + gc.get(Calendar.MONTH));
		System.out.println("Day:" + gc.get(Calendar.DAY_OF_MONTH));
		System.out.println("Am_pm:" + gc.get(Calendar.AM));
		System.out.println("Am_pm:" + gc.get(Calendar.HOUR_OF_DAY));
		
		Date joindate = new Date();
		System.out.println("Current date:"+ joindate);
		GregorianCalendar gc1 = new GregorianCalendar(2018, 1, 20);
		Date joindate2 = gc1.getTime();
		System.out.println("Past date:" + joindate2);
		
	}
}
