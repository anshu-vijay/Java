package com.sample.PracticeCode;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int rem = 0;
		int result = 0;
		while (temp != 0) {
			rem = temp % 10;
			result += Math.pow(rem, String.valueOf(num).length());
			temp /= 10;
		}
		
		if (result == num) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not an Armstrong");
		}
	}
}
