package com.sample.PracticeCode;

import java.util.HashMap;
import java.util.Map;

public class MatchingString {

	public static void main(String[] args) {
		String s = "badc";
		String t = "baba";
		String[] sa = s.split("");
		String[] ta = t.split("");
		Map<String, String> map = new HashMap<>();
		boolean flag = true;

		if (sa.length == ta.length) {
			for (int i = 0; i < sa.length; i++) {
				if (!map.containsKey(sa[i])) {
					map.put(sa[i], ta[i]);
				} else if (!map.get(sa[i]).equals(ta[i])) {
					System.out.println("map.get(sa[i]) " + map.get(sa[i]));
					System.out.println("ta[i] " + ta[i]);
					flag = false;
				}
			}
		} else {
			flag = false; // Lengths are different, so mapping can't be valid
		}

		for (Map.Entry<String, String> m : map.entrySet()) {
			System.out.format("Key: %s  Value:%s \n", m.getKey(), m.getValue());
		}
		System.out.println(flag);
	}
}
