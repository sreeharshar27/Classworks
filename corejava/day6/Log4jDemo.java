package com.htc.corejava.day6;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4jDemo {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(Log4jDemo.class);
		
		logger.log(Level.INFO, "Information message");
		logger.info("Info message");
		logger.error("Error message");
		logger.fatal("Fatal erro");
		logger.debug("Debug messages");
		logger.warn("warning message");
		logger.trace("Trace");
		
	}
}
