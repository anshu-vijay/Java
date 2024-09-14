package com.sample.PracticeCode;

import java.util.List;

public class FindMissingNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int n = arr.length;
		int sum1 = withoutMissingNumber(n);

		int sum2 = withMissingNumber(n);
		System.out.println(sum1 - sum2);

	}

	public static int withoutMissingNumber(int n) {
		int sum = ((n * (n + 1)) / 2);
		System.out.println("Sum 1 = " + sum);

		return sum;
	}

	public static int withMissingNumber(int n) {
		n = n - 1;
		int sum = ((n * (n + 1)) / 2);

		System.out.println("Sum 2 = " + sum);
		return sum;
	}

}
