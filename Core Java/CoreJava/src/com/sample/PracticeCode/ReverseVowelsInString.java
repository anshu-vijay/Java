package com.sample.PracticeCode;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsInString {

	public static void main(String[] args) {
		String s = "hello";
		char[] charArr = s.toCharArray();
		int vowelsCount = 0;
		List<Character> vowelList = new ArrayList<>();
		StringBuilder newString = new StringBuilder();
		for (Character ch : charArr) {
			boolean isVowel = isVowel(ch);
			if (isVowel) {
				vowelList.add(ch);
				vowelsCount++;
			}

		}

		for (Character ch : charArr) {
			boolean isVowel = isVowel(ch);
			if (isVowel) {
				int chIndex = s.indexOf(ch);
				charArr[chIndex] = vowelList.get(vowelsCount - 1);
				vowelsCount--;
				newString.append(charArr[chIndex]);
			} else {
				newString.append(ch);
			}
		}

		System.out.println(newString);

	}

	private static boolean isVowel(Character ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;

		}
		return false;
	}

}
