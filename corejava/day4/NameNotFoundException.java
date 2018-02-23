package com.htc.corejava.day4;

public class NameNotFoundException extends Exception{

	private String errorMessage;
	public NameNotFoundException() {
		this.errorMessage = "Name Not Found";
	}
	public NameNotFoundException(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String toString() {
		return errorMessage;
	}
	
}
