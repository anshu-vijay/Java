package com.sample.PracticeCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurence {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 6, 2, 2, 6, 8, 1, 2, 9, 5, 4, 7, 8 };
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		Map<Integer, Long> map = new HashMap<>();
		for (Integer element : list) {
			map.put(element, list.stream().filter(l -> l == element).count());
		}
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " :" + m.getValue());
		}

	}

}
