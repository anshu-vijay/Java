package com.sample.PracticeCode;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 11;
		boolean isPrime = true;
		if (num < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}
		}
		System.out.print(isPrime);
	}

}
