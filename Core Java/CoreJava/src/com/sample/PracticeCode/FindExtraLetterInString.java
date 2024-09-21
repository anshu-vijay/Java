package com.sample.PracticeCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindExtraLetterInString {

	public static void main(String[] args) {
//		System.out.println(findTheDifference("abcd", "abcde")); //e
		System.out.println(findTheDifference("a", "aa")); //a

	}
	
	public static char findTheDifference(String s, String t) {
		char ch = ' ';
		for (char c: t.toCharArray()) {
			if(s.contains(String.valueOf(c))) {
				long s1 = Arrays.stream(s.split("")).filter(e -> e.equals(String.valueOf(c))).count();
				long s2 = Arrays.stream(t.split("")).filter(e -> e.equals(String.valueOf(c))).count();
				if (s1 != s2) {
					ch = c;
				}
			}
			else {
				ch = c;
			}
			
		}
		return ch;
        
    }

}
