package com.javapractice.codility.problemsolving;

public class EggDropProblemOptimized {
 public static int eggDrop(int eggs,int floors) {
	 //Create a memoization array to store intermediate results
	 int[][]memo = new int[eggs+1][floors+1];
	 return eggDropHelper(eggs,floors,memo);
 }
 private static int eggDropHelper(int eggs,int floors,int[][]memo) {
	// If there is only one egg or no floors, we need the number of floors drops
     if (eggs == 1 || floors == 0)
         return floors;
     
     //If we already have calculated results to these parameters return it
     if(memo[eggs][floors]!=0) 
    	 	return 	memo[eggs][floors];
     int minDrops = Integer.MAX_VALUE;
     //Binary Search through each floor
     int low = 1;
     int high = floors;
     while(low<=high) {
    	 int mid = low+(high-low)/2;
    	 //Eggs Breaks at this floor, so we search in the lower most floors with one less egg
    	 int eggBreaks = eggDropHelper(eggs-1,high-1,memo);
    	 
    	 //Eggs doesn't break at this floor so we search in the higher floors with the same number of eggs
    	 int eggDoesntBreak = eggDropHelper(eggs,floors-mid,memo);
    	 
    	 //Find the maximim between two cases and add 1 for the current drop
    	 
    	 int maxDrops = 1 + Math.max(eggBreaks, eggDoesntBreak);
    	 //Update the minimum drops 
    	 if(eggBreaks > eggDoesntBreak) {
    		 high = mid-1;
    		 minDrops = Math.min(minDrops, maxDrops);
    	 }
    	 else {
    		 low = mid+1;
    		 minDrops = Math.min(minDrops, maxDrops);
    	 }
     }
     //Store the result in memoization array
     memo[eggs][floors] = minDrops;
     return minDrops;
    }
 public static void main(String args[]) {
	 int eggs = 2;
	 int floors = 100;
	 
	 int minDrops = eggDrop(eggs,floors);
	 System.out.println("Minimum number of drops required::"+minDrops);
 }
}
