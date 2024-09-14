package com.sample.PracticeCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckStringStartsWithVowel {

	public static void main(String[] args) {
		String[] arr = { "Apple", "Mango", "Orange" };
		Pattern p = Pattern.compile("[aeiou].*", Pattern.CASE_INSENSITIVE);
		for (String s : arr) {
			Matcher m = p.matcher(s);
			if (m.find()) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

		System.out.println("--------");

		String str = "  my name is  26 anshu vijay".trim();
		String[] strArr = str.split("\\s+");
		for (String c : strArr) {
			Matcher m = p.matcher(c);
			if (m.find()) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

		System.out.println("--------");

	}
}
