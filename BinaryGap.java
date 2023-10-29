package com.javapractice.codility.problemsolving;

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is
 * surrounded by ones at both ends in the binary representation of N.
 * <p/>
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The
 * number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and
 * one of length 3. The number 20 has binary representation 10100 and contains one binary gap of
 * length 1. The number 15 has binary representation 1111 and has no binary gaps. write java program
 */
public class BinaryGap {
	
	// Define a method to find the maximum binary gap in a positive integer N
    public static int findMaxBinaryGap(int N) {
        
        // Convert the positive integer N to its binary representation as a string
        String binaryString = Integer.toBinaryString(N);
        
        System.out.println("Binary String::"+binaryString);
        
        // Initialize variables to keep track of the maximum binary gap and the current binary gap
        int maxGap = 0;
        int currentGap = 0;
        
        // Initialize a boolean variable to indicate whether we are currently counting zeros
        boolean counting = false;
        
        // Loop through each character (0 or 1) in the binary string representation of N
        for (char c : binaryString.toCharArray()) {
            
            // If the current character is '1'
            if (c == '1') {
                // Check if we were previously counting zeros
                if (counting) {
                    // If so, update the maximum binary gap if the current gap is greater
                    maxGap = Math.max(maxGap, currentGap);
                    System.out.println("Max Gap::"+maxGap);
                    // Reset the current gap to zero
                    currentGap = 0;
                } else {
                    // If not, start counting zeros (we found the beginning of a binary gap)
                    counting = true;
                }
            } 
            // If the current character is '0' and we are currently counting zeros
            else if (counting) {
                // Increment the current gap
                currentGap++;
            }
        }
        
        // Return the maximum binary gap found in the binary representation of N
        return maxGap;
    }

    // The main method where the program starts execution
    public static void main(String[] args) {
        // Define a positive integer N (you can change this value)
        int N = 529; // Change this to the desired positive integer
        
        // Call the findMaxBinaryGap method to calculate the maximum binary gap for N
        int maxGap = findMaxBinaryGap(N);
        
        // Print the result
        System.out.println("The longest binary gap in " + N + " is " + maxGap);
    }
}
