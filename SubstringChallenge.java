package com.javapractice.javapractice.hackerrank;

import java.util.Scanner;

public class SubstringChallenge {
 int  val=10;
 public static void main(String args[]) {
	 Scanner scanner = new Scanner(System.in);

     // Read the number of integers in the list (N)
     int N = scanner.nextInt();
     
     int minNumber= Integer.MAX_VALUE;
     
     //Read the process and list N integers
     
     for (int i = 0; i < N; i++) {
         int number = scanner.nextInt();
         if(number<minNumber) {
        	 minNumber=number;
         }
         System.out.println("Minimum number: " + minNumber);
         scanner.close();

         // Print the minimum number
        
     }
 }
}
