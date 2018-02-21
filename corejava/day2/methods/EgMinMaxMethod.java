package com.htc.methods;

/** Example of Java Method definition and invocation */
public class EgMinMaxMethod {
   // The entry main() method
   public static void main(String[] args) {
      int a = 6, b = 9, max, min;
      max = max(a, b);  // invoke method max() with arguments
      min = min(a, b);  // invoke method min() with arguments
      System.out.println(max + "," + min);
   
      System.out.println(max(5, 8)); // invoke method max()
      System.out.println(min(5, 8)); // invoke method min()
   }

   // The max() method returns the maximum of two given numbers
   public static int max(int number1, int number2) {
      return (number1 > number2) ? number1 : number2;
   }

   // The min() method returns the minimum of two given numbers
   public static int min(int number1, int number2) {
      return (number1 < number2) ? number1 : number2;
   }
}