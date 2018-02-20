package com.htc.corejava.day1;

/* Default value of a datatype. */
public class DataTypeDefaultValue {
	
   public static void main(String[] args) {
	
	   //All local variables must be initialized in Java
	   
	  boolean boolVariable = false;   	// boolean of either true or false
      byte byteVariable = 0;           	// Range of byte is [-127, 128]
      short shortVariable = 0;       	// Range of short is [-32767, 32768]. Beyond byte
      char charVariable = '\u0000';     // Unicode null character
      int  intVariable = 0;             // Beyond the ranges of byte and short
      long longVariable = 0L; 		   	// Need suffix 'L' for long. Beyond int
      float floatVariable = 0.0f;      // Need suffix 'f' for float
      double doubleVariable = 0.0;      // With fractional part
      String name = null; 				// String is double-quoted

      // Println(..) can be used to print value of any type
      
      System.out.println("boolean value :" + boolVariable);
      System.out.println("byte value :" + byteVariable);
      System.out.println("short value :" + shortVariable);
      System.out.println("char value :" + charVariable);
      System.out.println("int value :" + intVariable);
      System.out.println("long value :" + longVariable);
      System.out.println("float value :" + floatVariable);
      System.out.println("double value :" + doubleVariable);
      System.out.println("String value: " + name);      
   }
   
}

