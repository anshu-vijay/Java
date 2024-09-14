package com.sample.PracticeCode;

public class RemoveSpecialSymbols {
	public static void main(String[] args) {
		String input = "    Hello!     This @string #has $some   %special ^symbols &*()";

		// Remove all special symbols using regex
		String cleanedString = input.replaceAll("[^a-zA-Z0-9\\s]", "");
		
		// Replace multiple spaces with a single space
        cleanedString = cleanedString.replaceAll("\\s+", " ");
        
        // Trim leading and trailing spaces (optional)
        cleanedString = cleanedString.trim();

		// Print the cleaned string
		System.out.println("Original String: " + input);
		System.out.println("Cleaned String: " + cleanedString);
	}
}
