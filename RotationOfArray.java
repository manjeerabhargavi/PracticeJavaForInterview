package com.javapractice.codility.problemsolving;
/**
 *  Rotation of the array means that each element is shifted right by one index
 */
public class RotationOfArray {
   public static int[] shiftArrayElements(int[]arr,int positionCountToBeShifted) {
	   int n = arr.length;
	   //Check for the edge cases
	   if(n==0||positionCountToBeShifted%n ==0) {
		   return arr; //No rotation needed
	   }
	   //Normalize position to be within the array length
	   positionCountToBeShifted = positionCountToBeShifted % n;
	   int[] rotatedArray = new int[n];
	   
	   //Copy last positionCountToBeShifted (for example 3) elements to the beginning of the array
	   System.arraycopy(arr, n-positionCountToBeShifted, rotatedArray, 0, positionCountToBeShifted);
	   
	   //Copy the remaining (n-positionCountToBeShifted) elements to the end of the rotated array
	   
	   System.arraycopy(arr, 0, rotatedArray, positionCountToBeShifted, n-positionCountToBeShifted);
	   
	   return rotatedArray;
	   
   }
   
   public static void printArray(int[] arr) {
	   System.out.print("[");
	   for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]);
		   if(i<arr.length-1) {
			   System.out.print(",");
		   }
	   }
	   System.out.print("]");
	   
   }
   
   public static void main(String args[]) {
	   int[] arr1 = {3, 8, 9, 7, 6};
	   int positionCountToBeShifted = 3;
	   int[]rotatedArray = new int[arr1.length];
	   rotatedArray = shiftArrayElements(arr1,positionCountToBeShifted);
	   printArray(rotatedArray);
   }
}
