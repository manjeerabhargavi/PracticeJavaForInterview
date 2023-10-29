package com.javapractice.codility.problemsolving;

import java.util.Scanner;

public class StairCase {
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   
	   int n =  sc.nextInt();
	   printStairCase(n);
   }

private static void printStairCase(int n) {
   for(int i=0;i<n;i++) {
	   for(int j=1;j<=i+1;j++) {
		  
		   System.out.print("# ");
	   }
	   System.out.println(" ");
   }
   }
}
