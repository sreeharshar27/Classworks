package com.htc.loops;

/*
 * List all prime numbers between 2 and an upperbound
 */
public class PrimeListWithBreak {
   public static void main(String[] args) {
      int upperbound = 100;
      for (int number = 2; number <= upperbound; ++number) {
         // Not a prime, if there is a factor between 2 and sqrt(number)
         int maxFactor = (int)Math.sqrt(number);
         boolean isPrime = true;  // boolean flag to indicate whether number is a prime
         for (int factor = 2; factor <= maxFactor; ++factor) {
            if (number % factor == 0) {   // Factor?
               isPrime = false;   // number is not a prime
               break;   // A factor found, no need to search for more factors
            }
         }
         if (isPrime) System.out.println(number + " is a prime");
      }
   }
}