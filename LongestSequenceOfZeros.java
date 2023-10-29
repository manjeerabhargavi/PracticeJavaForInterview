package com.javapractice.codility.problemsolving;

import java.util.stream.Stream;

public class LongestSequenceOfZeros {
  public static void main(String args[]) {
	  int num = 166;
	  int longestSequence = getLongestSequence(num);
	  System.out.println("Longest Sequence is ::"+longestSequence);
  }

private static int getLongestSequence(int num) {
	String binaryString = Integer.toBinaryString(num);
	System.out.println("Binary String is::"+binaryString);
	String[] zeroSequences = binaryString.split("1");
	System.out.println("Zero Sequences ="+zeroSequences);
	int longestSequence = Stream.of(zeroSequences).mapToInt(String::length).max().orElse(0);
	return longestSequence;
}

}
