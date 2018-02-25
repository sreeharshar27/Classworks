package com.htc.corejava.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//This program uses city name as Key and List of temparature as value. 
//Temparature recorded at varius time of the day.
public class MapDemo {
	
	HashMap<String, List<Double>> cityTemps = new HashMap<String, List<Double>>();
	
	public void addEntry(String cityName, List<Double> tempList){
		cityTemps.put(cityName, tempList);
	}
	
	public List<Double> getTempratures(String cityName) throws CityNotFoundException {
		if(cityTemps.containsKey(cityName)) {
			return cityTemps.get(cityName);
		}
		else{
			throw new CityNotFoundException();
		}
	}
	
	public double getMaximumTemparature(String cityName) throws CityNotFoundException{
		
		double maxTemp = Double.MIN_VALUE;	
		if(cityTemps.containsKey(cityName)) {	
			List<Double> tempList = cityTemps.get(cityName);
			maxTemp = Collections.max(tempList);
		}else{
			throw new CityNotFoundException();
		}
		return maxTemp;
	}
	
	public double getMinimumTemparatur(String cityName) throws CityNotFoundException{
		
		double minTemp = Double.MIN_VALUE;
		if(cityTemps.containsKey(cityName)) {	
			List<Double> tempList = cityTemps.get(cityName);
			minTemp = Collections.min(tempList);
		}else{
			throw new CityNotFoundException();
		}
		return minTemp;
	}
	
	public static void main(String[] args) {
		
		MapDemo md = new MapDemo();
		
		//populating map with data
		
		List<Double> chennaiTempList = new ArrayList<Double>();
		chennaiTempList.add(29.0);
		chennaiTempList.add(38.0);
		chennaiTempList.add(36.0);
		md.addEntry("Chennai", chennaiTempList);
		
		List<Double> bngloreTempList = new ArrayList<Double>();
		bngloreTempList.add(25.0);
		bngloreTempList.add(35.0);
		bngloreTempList.add(32.0);
		md.addEntry("Bangalore", bngloreTempList);
		
		List<Double> hydTempList = new ArrayList<Double>();
		hydTempList.add(26.0);
		hydTempList.add(41.0);
		hydTempList.add(33.0);
		md.addEntry("Hyderabad", hydTempList);
		
		List<Double> mumTempList = new ArrayList<Double>();
		mumTempList.add(30.0);
		mumTempList.add(39.0);
		mumTempList.add(34.0);
		md.addEntry("Mumbai", mumTempList);
		
		//===========================================================
		
		List<Double> tempList = md.getTempratures("Hyderabad");
		System.out.println(tempList);
		
		//============================================================
		
		double maxTemp = md.getMaximumTemparature("Chennai");
		System.out.println("Max temp: " + maxTemp);
		
		//============================================================
		
		double minTemp = md.getMinimumTemparatur("Chennai");
		System.out.println("Min temp: " + minTemp);
		
	}
}
