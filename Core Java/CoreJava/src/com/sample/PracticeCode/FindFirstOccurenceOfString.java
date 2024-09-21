package com.sample.PracticeCode;

public class FindFirstOccurenceOfString {

	public static void main(String[] args) {
//		System.out.println(strStr("sadbutsad", "sad")); //0
		System.out.println(strStr("hello", "ll")); //2

	}

	public static int strStr(String haystack, String needle) {
		char[] ch = haystack.replaceAll(needle, "-").toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '-') {
				return i;
			}
		}
		return 0;
	}

}
