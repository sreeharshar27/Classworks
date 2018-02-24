package com.htc.corejava.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateFormatDemo {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		
		String formattedDate = sdf.format(new Date());
		
		System.out.println(formattedDate);
		
		TimeZone tz = TimeZone.getTimeZone("America/Chicago");
		GregorianCalendar gc3 = new GregorianCalendar(tz);
		Date date3 = gc3.getTime();
		System.out.println("date in timezone" + date3);
		
		System.out.println("parsed date\n=============");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		String inputDate = "45/11/2018";
		Date date4=null;
		try {
			date4 = sdf2.parse(inputDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date4);
		
		java.util.Date date5 = new java.util.Date();
		java.sql.Date date6 = new java.sql.Date(date5.getTime());
		
		System.out.println(date5);
		System.out.println(date6);
	}
}
