package com.javapractice.codility.problemsolving;
/**
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

class Solution { public int solution(int X, int Y, int D); }

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Write an efficient algorithm for the following assumptions:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y. write java program with comments on each line


 */

public class FrogJump {
 public static void main(String args[]) {
	 int X = 10;
	 int Y = 85;
	 int D = 30;
	 
	 //Calculate the minimal number of jumps
	 
	 int minimumNumberOfJumps = frogJumpDistance(X,Y,D);
	 System.out.println("minimal number of jumps;;"+minimumNumberOfJumps);
 }

private static int frogJumpDistance(int x, int y, int d) {
	// calculate the distance to cover
	int distanceToCover = y-x;
	
	//Calculate the number of jumps required (rounded up)
	int jumpsRequired = distanceToCover/d;
	
	//if there is a remainder one more jump is required 
	
	if(distanceToCover%d != 0) {
		System.out.println("DistanceCovered%D="+distanceToCover%d);
		jumpsRequired++;
	}
	return jumpsRequired;
}
 
}
