package com.sample.linkedlist;

import java.util.LinkedList;

public class LinkedListMethods2 {
	public void display(LinkedList<Student> studentList) {
		for (Student student : studentList) {
			System.out.println(student.getFullname());
		}
	}

	public void isEmpty(LinkedList<Student> studentList) {
		if (studentList.isEmpty()) {
			System.out.println("Yes, the list is empty");
		}
		System.out.println("No, list contains few items");
	}

	public void printFirstElement(LinkedList<Student> studentList) {
		System.out.println(studentList.get(0).getFullname());
	}
}
