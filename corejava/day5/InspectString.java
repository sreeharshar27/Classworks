package com.htc.corejava.day5;

public class InspectString {

	public static void main(String[] args) {
		
		int upperCaseCount   = 0;
		int lowerCaseCount   = 0;
		int numberCount      = 0;
		int spacesCount      = 0;
		int specialCharCount = 0;
		
		String line = "This is to inspect all characters in the string. Numbres(0103), Special characters, Capital letters, small case, spaces etc";
		
		for(int i=0; i<line.length(); i++) {
			char ch = line.charAt(i);
			if(Character.isUpperCase(ch)) 
				upperCaseCount++;
			else if(Character.isLowerCase(ch)) 
				lowerCaseCount++;
			else if(Character.isWhitespace(ch))
				spacesCount++;
			else if(Character.isDigit(ch))
				numberCount++;
			else
				specialCharCount++;
		}
		
		System.out.println("Statitics\n==========");
		System.out.println("Uppercase:" + upperCaseCount);
		System.out.println("Lowercase:" + lowerCaseCount);
		System.out.println("Spaces:" + spacesCount);
		System.out.println("Digits:" + numberCount);
		System.out.println("Special char count:" + specialCharCount);
	}
}
