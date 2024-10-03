package com.sample.PracticeCode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {


    public static void main(String[] args) {
        String digits = "23";  // Input digits
        List<String> result = letterCombinations(digits);  // Get all letter combinations
        System.out.println(result);  // Print the result
    }

    // This method returns all combinations of letters for the input digits
    public static List<String> letterCombinations(String digits) {
        // If no digits are provided, return an empty list
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        // Array to map digits to corresponding letters
        String[] mapping = {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };

        List<String> result = new ArrayList<>();
        generateCombinations(result, digits, mapping, 0, "");  // Start generating combinations
        return result;  // Return the list of combinations
    }

    // Helper method to generate combinations
    private static void generateCombinations(List<String> result, String digits, String[] mapping, int index, String current) {
        // If we've gone through all the digits, add the current combination to the result
        if (index == digits.length()) {
            result.add(current);  // Add the combination
            return;  // Exit the method
        }

        // Get the letters that correspond to the current digit
        String letters = mapping[digits.charAt(index) - '0'];  // Get letters for current digit
        for (char letter : letters.toCharArray()) {  // Loop through each letter
            generateCombinations(result, digits, mapping, index + 1, current + letter);  // Combine letters
        }
    }
}

