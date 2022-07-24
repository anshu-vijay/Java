package com.sample.linkedlist;

import java.util.LinkedList;

public class Solution2 {

	public static void main(String[] args) {
		LinkedList<Student> studentList = new LinkedList<Student>();

		Student s1 = new Student(1, "Anshu Vijay", 82);
		Student s2 = new Student(2, "Mahi Vijay", 91);
		Student s3 = new Student(3, "Ankit Vijay", 82);
		Student s4 = new Student(4, "Akshat Vijay", 78);

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(new Student(5, "Sagar Vijay", 70));

		LinkedListMethods2 method = new LinkedListMethods2();

		method.display(studentList);
		/*
		 * Anshu Vijay 
		 * Mahi Vijay 
		 * Ankit Vijay 
		 * Akshat Vijay 
		 * Sagar Vijay
		 */
		method.printFirstElement(studentList); // Anshu Vijay
		method.isEmpty(studentList); // No, list contains few items

	}

}
