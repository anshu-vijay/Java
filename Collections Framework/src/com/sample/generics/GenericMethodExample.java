package com.sample.generics;

import java.util.ArrayList;
import java.util.List;

class Example4 {
	public <E> void printListData(List<E> list) {
		for (E element : list) {
			System.out.println(element);
		}
	}
	
	public <E> void printArrayData(E[] arrayData) {
		for (E element : arrayData) {
			System.out.println(element);
		}
	}
}

public class GenericMethodExample {

	public static void main(String[] args) {
		List<String> carsList = new ArrayList<String>();
		carsList.add("Volvo");
		carsList.add("BMW");
		carsList.add("Ford");
		carsList.add("Mazda");

		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(3);
		intList.add(5);
		intList.add(7);
		
		String[] strArr = {"One","Two","Three"};
		Integer[] intArr = {1,3,4,6};
		
		Example4 ex = new Example4();
		ex.printListData(carsList);
//		Volvo
//		BMW
//		Ford
//		Mazda
		ex.printListData(intList);
//		1
//		3
//		5
//		7
		ex.printArrayData(strArr);
//		One
//		Two
//		Three
		ex.printArrayData(intArr);
//		1
//		3
//		4
//		6
	}

}
