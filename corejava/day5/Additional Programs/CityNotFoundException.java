package com.htc.corejava.day5;

public class CityNotFoundException extends RuntimeException{

	String errorMessage;
	public CityNotFoundException(){
		errorMessage = "City not found";
	}
	public CityNotFoundException(String errorMessage){
		this.errorMessage = errorMessage;
	}
	public String toString(){
		return errorMessage;
	}
}
