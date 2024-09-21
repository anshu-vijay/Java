package com.sample.PracticeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

//		Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
		groupAnagrams(strs);

	}

	public static void groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();

		for (String item : strs) {
			String og = item;
			char[] ca = item.toCharArray();
			Arrays.sort(ca);
			String check = new String(ca);
			if (!map.containsKey(ca)) { // if this anagram is not present then add a List<String> against that anagram
				map.put(check, new ArrayList<>());
			}
			map.get(check).add(og);
		}

	}
}
