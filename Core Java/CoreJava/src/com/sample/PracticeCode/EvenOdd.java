package com.sample.PracticeCode;

public class EvenOdd {

	public static void main(String[] args) {
		int num = 346;

		// Method 1
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		// Method 2
		if ((num / 2) * 2 == num) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		// Method 3
		if ((num & 1) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
