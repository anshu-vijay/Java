package com.sample.PracticeCode;

import java.util.Arrays;

public class ArraysMethods {
	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Tesla", "Merc", "Honda" };
		String[] cars2 = { "Volvo", "BMW", "Tesla" };

		System.out.println(cars.length);
//		5

		System.out.println(Arrays.compare(cars, cars2));
//		 2 means differ by two values

		System.out.println(Arrays.equals(cars, cars2));
//		 true

		Arrays.sort(cars);
		printArr(cars);
//		BMW
//		Honda
//		Merc
//		Tesla
//		Volvo
		
		String[] mergedArray = new String[cars.length + cars2.length];

        System.arraycopy(cars, 0, mergedArray, 0, cars.length);
        System.arraycopy(cars2, 0, mergedArray, cars.length, cars2.length);

        // Printing the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

	}

	static void printArr(String[] arr) {
		for (String i : arr) {
			System.out.println(i);
		}
	}

}
