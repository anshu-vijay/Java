package com.sample.comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		List<Student> student = new LinkedList<Student>();
		student.add(new Student(1,"Anshu",50));
		student.add(new Student(2,"Aarti",40));
		student.add(new Student(3,"Somi",50));
		student.add(new Student(4,"Shivani",60));
		student.add(new Student(5,"Pooja",40));
		printList(student);
		
//		1 Anshu
//		2 Aarti
//		3 Somi
//		4 Shivani
//		5 Pooja
		
		System.out.println("***************************");
		Collections.sort(student);
		printList(student);
		
//		2 Aarti
//		1 Anshu
//		5 Pooja
//		4 Shivani
//		3 Somi
	}

	static void printList(List<Student> studentList) {
		for (Student studentDetails : studentList) {
			System.out.println(studentDetails.getSid() + " " + studentDetails.getFullname());
		}
	}
}
