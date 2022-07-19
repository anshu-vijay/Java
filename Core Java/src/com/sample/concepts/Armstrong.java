package com.sample.concepts;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		int length = String.valueOf(num).length();
		System.out.println("Length of number : " + length);
		int temp = num, sum = 0, rem;
		while (temp > 0) {
			rem = temp % 10;
			int remWithLengthAsPower = (int) Math.pow(rem, length);
			sum = sum + remWithLengthAsPower;
			temp = temp / 10;

		}
		if (sum == num) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not an Armstrong");
		}
	}

}
