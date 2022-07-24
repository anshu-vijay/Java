package com.sample.arraylist;

import java.util.ArrayList;

public class ArrayListMethods2 {
	public void display(ArrayList<Student> studentList) {
		for (Student student : studentList) {
			System.out.println(student.getFullname());
		}
	}

	public void isEmpty(ArrayList<Student> studentList) {
		if (studentList.isEmpty()) {
			System.out.println("Yes, the list is empty");
		}
		System.out.println("No, list contains few items");
	}

	public void printFirstElement(ArrayList<Student> studentList) {
		System.out.println(studentList.get(0).getFullname());
	}
}
