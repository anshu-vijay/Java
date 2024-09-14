package com.sample.PracticeCode;

import java.util.regex.*;

public class VowelsConsonants {

	public static void main(String[] args) {
		String str = "wetairthnbgfbdc";
		String vowels = "";
		String consonants = "";
		Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
		for (String s : str.split("")) {
			Matcher m = pattern.matcher(s);
			if(m.find()) {
				vowels += s;
			}
			else {
				consonants +=s;
			}
		}
		System.out.print(vowels + " " +consonants);

	}

}
