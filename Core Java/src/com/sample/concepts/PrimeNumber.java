package com.sample.concepts;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		boolean isPrime = true;
		for (int i = 2; i<num/2;i++) {
			if (num%i == 0) {
				isPrime = false;				
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("Prime Number");			
		}
		else {
			System.out.println("Not a Prime Number");
		}
		
	}

}
