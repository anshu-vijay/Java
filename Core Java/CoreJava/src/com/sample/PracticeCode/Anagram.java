package com.sample.PracticeCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		String[] a = "rauce".split("");
		String[] b = "carew".split("");

		List<String> ls1 = Arrays.asList(a);
		List<String> ls2 = Arrays.asList(b);
		Collections.sort(ls1);
		Collections.sort(ls2);

		if (ls1.equals(ls2)) {
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}
	}

}
