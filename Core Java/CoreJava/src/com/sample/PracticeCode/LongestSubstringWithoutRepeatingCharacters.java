package com.sample.PracticeCode;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {

		String s = "pwwkew";
		if (s.equals(" ")) {
			System.out.println(s.length());
		} else {
			String[] word = s.split("");
			String finalStr = "";
			int subStringLength = 0;
			for (int i = 0; i < word.length; i++) {
				String substring = word[i];
				subStringLength = substring.length();
				for (int j = i + 1; j < word.length; j++) {
					if (!substring.contains(word[j])) {
						substring += word[j];
						subStringLength += 1;
					} else {
						break;
					}
				}
				if (subStringLength > finalStr.length()) {
					subStringLength = finalStr.length();
					finalStr = substring;
				}

			}
			System.out.println(finalStr);
			System.out.println(finalStr.length());
		}
	}

}
