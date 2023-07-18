package com.codes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintVowelsFromString {
	public static void main(String args[]) {
		// source string
		String str = "Anshu Vijay";
		Pattern compile = Pattern.compile("[aeiouAEIOU]"); //[aeiouAEIOU]
		Matcher matcher = compile.matcher(str); //java.util.regex.Matcher[pattern=[aeiouAEIOU] region=0,11 lastmatch=]

		while (matcher.find()) {
			String vowel = matcher.group();
			System.out.print(vowel + " ");
		}
//		System.out.println(count);
	}
}
