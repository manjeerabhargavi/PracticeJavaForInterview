package com.javapractice.codility.problemsolving;
/**
 * 

write java program for the following problem explain each step with comment An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.



 */
public class FindMissingElementInArray {
  public static int getMissingElement(int[] array) {
	  //Calculate the expected sum of integers from 1 to N+1
	  int n = array.length+1;
	  System.out.println("N Length::"+n);
	  int expectedSum = (n*(n+1))/2;
	  
	  //Calculate the actual sum of the elements of the array
	  
	  int actualSum = 0;
	  for(int num:array) {
		  actualSum = actualSum+num;
		  System.out.println("Actual Sum::"+actualSum);
	  }
	  
	 //The missing element is 
	  int missingElement = expectedSum-actualSum;
	 return missingElement; 
  }
  public static void main(String args[]) {
	  int[]array = {2,3,1,5};
	  
	  //Call the solution method to find the missing element
	  int missingElement = getMissingElement(array);
	  
	  System.out.println("The missing element is::"+missingElement);
	  
  }
}
