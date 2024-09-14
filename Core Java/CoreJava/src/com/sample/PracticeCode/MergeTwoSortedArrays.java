package com.sample.PracticeCode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 7, 9 };
		int[] arr2 = { 2, 6, 8 };
		
		//Method 1
		
        // Merging the two arrays and sorting them using streams
        int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                                     .sorted()
                                     .toArray();

        // Printing the merged and sorted array
        Arrays.stream(mergedArray).forEach(System.out::println);
        
        System.out.println("-------------------------------");
        //Method 2
		int len1 = arr1.length;
		int len2 = arr2.length;
		int maxLength = Math.max(len1, len2);
		int total = len1 + len2;

		int i = 0, j = 0, l = 0;
		while (i < len1 && j < len2) {
			if (arr1[i] < arr2[j]) {
				System.out.println(arr1[i]);
				++i;
			} else if (arr1[i] > arr2[j]) {
				System.out.println(arr2[j]);
				++j;
			}
		}
		if (i < len1) {
			for (int index = i; i < len1; i++) {
				System.out.println(arr1[i]);
			}
		} else if (j < len2) {
			for (int index = j; j < len1; j++) {
				System.out.println(arr1[j]);
			}
		}

	}

	private static void print(int[] arr) {
		for (int element : arr) {
			System.out.println(element);
		}

	}

}
