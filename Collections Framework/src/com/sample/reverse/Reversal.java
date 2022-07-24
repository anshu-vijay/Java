package com.sample.reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reversal {

	public static void main(String[] args) {
		
		List<String> carsList = new ArrayList<String>();
		carsList.add("Volvo");
		carsList.add("BMW");
		carsList.add("Ford");
		carsList.add("Mazda");
		
		Collections.reverse(carsList);
		System.out.println(carsList);
		
		//[Mazda, Ford, BMW, Volvo]

	}

}
