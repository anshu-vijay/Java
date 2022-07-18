package com.oopsconcepts;

public class Student_main {

	public static void main(String[] args) {
		//with default constructor 
		Student_pojo s1 = new Student_pojo();
		System.out.println(s1.toString());		//Student_pojo [sid=0, fullname=NA, address=null]
		Student_Address a1 = new Student_Address();
		System.out.println(a1.toString());		//Student_Address [house_num=0, area=NA, cit=NA]
		
		
		//with parameterized constructor
		Student_Address a2 = new Student_Address(20,"abc","xyz");
		Student_pojo s2 = new Student_pojo(1,"Anshu Vijay",a2);
		System.out.println(s2.toString());
		//Student_pojo [sid=1, fullname=Anshu Vijay, address=Student_Address [house_num=20, area=abc, cit=xyz]]
		
		System.out.println(s2.getAddress().getArea());		//abc

	}

}
