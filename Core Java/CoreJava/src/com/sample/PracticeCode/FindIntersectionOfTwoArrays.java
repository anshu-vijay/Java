package com.sample.PracticeCode;

public class FindIntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 6, 5, 3 };
		int[] arr2 = { 4, 2, 6, 8, 1, 4 };

		for (int i : arr1) {
			for (int j : arr2) {
				if (i == j) {
					System.out.println(i);
				}
			}
		}

	}

}
