package com.htc.corejava.day5;

import java.sql.Timestamp;
import java.util.Date;

/*
 * --EPOCH--
 * An epoch is a an absolute time reference. 
 * Most programming languages (e.g Java, JavaScript, Python) use the Unix epoch (Midnight 1 January 1970) 
 * when expressing a given timestamp as the number of milliseconds elapsed since a fixed point-in-time reference.
 */

public class EpochDemo {

	public static void main(String[] args) {
		
		long epochTime =  145566778888L;  // Assume this is the epoch you received,
		                                  // if you receive a string, parse it as follows.
		                                  // Long.parseLong("15567777888L");
		
		//If the epoch rececived is in seconds, coverts to milliseconds.
		
		Timestamp ts = new Timestamp(epochTime); // for creating Timestamp
		Date d = new Date(epochTime);            // For creating Date
		
		
		//check here with your valid values.
	}
}
