package com.sample.PracticeCode;

public class Palindrome {

	public static void main(String[] args) {
		String s1 = "ABCDCBA";
//		String s1 = "ABBA";
		int len1 = s1.length();
		StringBuilder part1 = new StringBuilder();
		StringBuilder part2 = new StringBuilder();
		int mid = len1 / 2;
		if (len1 % 2 == 0) {
			part1.append(s1.substring(0, mid));
			part2.append(s1.substring(mid));
			part2 = part2.reverse();

		} else {
			part1.append(s1.substring(0, mid));
			part2.append(s1.substring(mid + 1));
			part2 = part2.reverse();
		}

		System.out.println("Part 1: " + part1);
		System.out.println("Part 2: " + part2);

		if (part1.toString().equals(part2.toString())) {
			System.out.println(s1 + " is a palindrome");
		} else {
			System.out.println(s1 + " is not a palindrome");
		}

	}

}
