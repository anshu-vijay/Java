package com.sample.PracticeCode;

public class MaximumElementInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 3, 8, 0, 23, 4, 2 };
		int max = 0;
		for (int element : arr) {
			if (element > max) {
				max = element;
			}

		}

		System.out.println(max);

	}

}
