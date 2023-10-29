package com.javapractice.codility.problemsolving;

import java.util.stream.IntStream;

public class EggDropProblem {
   public static int eggDrop(int eggs, int floors) {
	//Create 2D Array to Store the results of subprograms
	   int[][]drop = new int[eggs+1][floors+1];
	   //Base Case : If there are no floors or one floor , only one trial is needed
	   for(int i=1;i<=eggs;i++) {
		   drop[i][0]=0;
		   drop[0][1]=1;
	 }
	   //Base case : If there is one egg , the number of trials is equal to the number of floors
	   for(int j=1;j<=floors;j++) {
		   drop[1][j] = j;
	   }
	   //Fill the drop table using the bottom-up approach
	   
	   for(int i=2;i<=eggs;i++) {
		   for(int j=2;j<=floors;j++) {
			   drop[i][j]=Integer.MAX_VALUE;
			   //Try dropping the egg from each floor
			   for(int k=1;k<=j;k++) {
				   //if the egg breaks we need to check the floors below with one less egg
				   //if the egg doesn't break we need to check the floors above with the same number of eggs
				   
				   int maxDrops = 1+Math.max(drop[i-1][k-1], drop[i][j-k]);
				   drop[i][j] = Math.min(drop[i][j], maxDrops);
			   }
		   }
	   }
	// The result is stored in drop[eggs][floors]
       return drop[eggs][floors];
   }
   
   public static void main(String args[]) {
	   int eggs = 2; // Number of eggs
       int floors = 100; // Number of floors

       int minDrops = eggDrop(eggs, floors);

       System.out.println("Minimum number of drops required: " + minDrops);
   }
	  
}
