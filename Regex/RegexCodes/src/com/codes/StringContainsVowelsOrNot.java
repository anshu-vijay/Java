
package com.codes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class StringContainsVowelsOrNot {

	public static void main(String args[]) {
		String regex = "[aeiouAEIOU]";
		System.out.println("Enter input string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		// Compiling the regular expression
		Pattern.compile(regex);
		// Compiling the regular expression
		Pattern pattern = Pattern.compile(regex); //[aeiouAEIOU]
		Matcher matcher = pattern.matcher(input);
		if (matcher.find()) {
			System.out.println("The input string contains vowels");
		} else {
			System.out.println("The input string does not contain vowels");
		}
	}
}

//Output
//Enter input string: 
//Anshu Vijay
//The input string contains vowels