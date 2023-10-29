package com.javapractice.codility.problemsolving;
/**
 * write a java program  for the following problem A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7
Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.

For example, given:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−1,000..1,000].
write comments for every line
 */
public class TapeExample {
	public static void main(String args[]) {
	int[] array = {3, 1, 2, 4, 3};
	
	//Create an instance of the solution
	
	TapeExample tapeExample = new TapeExample();
	int minimalDifference = tapeExample.solution(array);
	
	//print the result
	System.out.println("The minimal difference ::"+minimalDifference);
	}

	private int solution(int[] array) {
		// Calculate the total sum of all elements in the array
		int totalSum = 0;
		 for(int num:array) {
			 totalSum = totalSum+num;
		 }
		 
		 //Initialize the minimum difference with large value
		 
		 int minDifference = Integer.MAX_VALUE;
		 
		 //Initialize the left sum
		 int leftSum = 0;
		 
		 //Iterate Through array to find the minimum difference 
		 
		 for(int i=0;i<array.length-1;i++) {
			 //Add the current element to the left sum
			 
			 leftSum = leftSum+array[i];
			 System.out.println("Left Sum::"+leftSum);
			 // Calculate the right sum as the total sum minus the left sum
			 int rightSum = totalSum-leftSum;
			 
			 System.out.println("Right Sum::"+rightSum);
			 
			 //Calculate the absolute difference between left and right sum
			 
			 int difference = Math.abs(leftSum - rightSum);
			 
			 if(difference < minDifference) {
				 minDifference = difference;
			 }
			 
		 }
		return minDifference;
	}

}
