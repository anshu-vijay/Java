package com.sample.sorting;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> carsList = new ArrayList<String>();
		carsList.add("Volvo");
		carsList.add("BMW");
		carsList.add("Ford");
		carsList.add("Mazda");
		carsList.sort(null);
		
		System.out.println(carsList);
	}
	//[BMW, Ford, Mazda, Volvo]
}
