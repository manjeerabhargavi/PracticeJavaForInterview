package com.javapractice.codility.problemsolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {
	public static void main(String args[]) {
		
		List<String>names = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "David", "Bob", "Charlie", "Eve");

        // Create a HashMap to store the name frequencies
        Map<String, Integer> nameFrequency = new HashMap<>();

        // Use Java 8 streams to calculate the name frequencies
        names.forEach(name -> nameFrequency.merge(name, 1, Integer::sum));

        // Display names that occur more than once
        nameFrequency.forEach((name, frequency) -> {
            if (frequency > 1) {
                System.out.println(name + " occurs " + frequency + " times.");
            }
        });
    }
}
	
