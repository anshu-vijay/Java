package com.sample.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List carsList = new LinkedList<>();
		carsList.add(new Cars("Honda City"));
		carsList.add(new Cars("Creta"));
		carsList.add(new Cars("Amaze"));
		carsList.add(new Cars("Aura"));
		carsList.add(new Cars("Swift"));
		printList(carsList);
		
//		Honda City
//		Creta
//		Amaze
//		Aura
//		Swift
		
		System.out.println("*******************************");
		Collections.sort(carsList);
		printList(carsList);
	
//		Aura
//		Creta
//		Amaze
//		Swift
//		Honda City
	}
	
	static void printList(List<Cars> listOfCars) {
		for(Cars car : listOfCars) {
			System.out.println(car.toString());
		}
	}

}

class Cars implements Comparable<Cars> {

	private String carName;

	@Override
	public String toString() {
		return carName;
	}

	public Cars(String carName) {

		this.carName = carName;
	}

	@Override
	public int compareTo(Cars obj) {

		if (carName.length() == obj.carName.length()) {
			return 0;
		} else if (carName.length() < obj.carName.length()) {
			return -1;
		}
		return 1;

	}
}
