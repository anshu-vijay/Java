package com.sample.PracticeCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargetinArray {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 3, 8, 89, 3, 56, 27, 76 };
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Removed :" + list.remove(0));
		System.out.println(list);
		System.out.println(list.get(0));

	}

}
