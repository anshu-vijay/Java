package com.sample.PracticeCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 6, 5, 3, 2, 6 };
		Map<Integer, Integer> map = new HashMap<>();

		//Print the count of the repeated digits
		for (int element : arr1) {

			map.putIfAbsent(element, 1);
			if (map.containsKey(element)) {
				int value = map.get(element);
				map.put(element, ++value);
			}

		}

		System.out.println("Print the count of the repeated digits");
		System.out.println(map);
		
		System.out.println("Without duplicates");
		List<Set<Integer>> removed_duplicates = new ArrayList<>();
		removed_duplicates.add(map.keySet());
		System.out.println(removed_duplicates.get(0));

	}

}
