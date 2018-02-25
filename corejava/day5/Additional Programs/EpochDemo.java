package com.htc.corejava.day5;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * --EPOCH--
 * An epoch is a an absolute time reference. 
 * Most programming languages (e.g Java, JavaScript, Python) use the Unix epoch (Midnight 1 January 1970) 
 * when expressing a given Timestamp as the number of milliseconds elapsed since a fixed point-in-time reference.
 */

public class EpochDemo {

	public static void main(String[] args) {
		
		long epochTime =  1515996044000L;  // Assume this is the epoch you received,
		                                  // if you receive a string, parse it as follows.
		                                  // Long.parseLong("1515996044000L");
		
		//If the epoch received is in seconds, converts to milliseconds (multiply by 1000L).
		
		Timestamp ts = new Timestamp(epochTime); // for creating Timestamp
		Date d = new Date(epochTime);            // For creating Date
		
		System.out.println("Date:"+ d);
		System.out.println("Timestamp:" + ts);
	}
}
