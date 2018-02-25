package com.htc.corejava.day5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

//Timezone demo.
public class TimezoneDemo {

	public static void main(String[] args) {
		Date today = new Date();
		
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z"); 
        df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(today);
        System.out.println("Date in Indian Timezone (IST) : " + IST);
      
        df.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
        String EST = df.format(today);
        System.out.println("Date in EST Timezone : " + EST);
  
        df.setTimeZone(TimeZone.getTimeZone("US/Central"));
        String CST = df.format(today);
        System.out.println("Date in CST Timezone : " + CST);

        df.setTimeZone(TimeZone.getTimeZone("US/Pacific"));
        String PST = df.format(today);
        System.out.println("Date in PST Timezone : " + PST);

	}
}
