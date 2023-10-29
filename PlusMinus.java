package com.javapractice.codility.problemsolving;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		//Read elements of array
              for(int i=0;i<n;i++) {
            	  System.out.println("Enter elements::");
            	  arr[i] = sc.nextInt();
              }
              
              calculateRatios(arr); // Call the function to calculate and print ratios
              sc.close();
	}

	private static void calculateRatios(int[] arr) {
		int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
		for(int num:arr) {
			if(num>0) {
				positiveCount++;
			}
			else if(num<0) {
				negativeCount++;
			}
			else {
				 zeroCount++;
			}
		}
		int totalCount = arr.length;

        // Calculate and print the ratios with 6 decimal places
        System.out.printf("%.6f%n", (double) positiveCount / totalCount);
        System.out.printf("%.6f%n", (double) negativeCount / totalCount);
        System.out.printf("%.6f%n", (double) zeroCount / totalCount);
	}

}
