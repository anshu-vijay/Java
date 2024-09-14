package com.sample.PracticeCode;

public class LongestSubsequenceWithoutRepeatingCharacters {
	public static void main(String[] args) {

		String[] word1 = "abcabcbb".split("");
		String subseq = "";
		for (String s : word1) {
			if (!subseq.contains(s)) {
				subseq += s;
			}
		}
		System.out.println(subseq); // abc

	}
}
