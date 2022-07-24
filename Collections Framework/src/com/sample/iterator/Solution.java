package com.sample.iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) {
		LinkedList<String> carsList = new LinkedList<String>();
		carsList.add("Volvo");
		carsList.add("BMW");
		carsList.add("Ford");
		carsList.add("Mazda");
		
		Iterator<String> itr = carsList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

//	Volvo
//	BMW
//	Ford
//	Mazda

}
