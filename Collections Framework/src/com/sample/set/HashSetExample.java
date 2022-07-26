package com.sample.set;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetExample {
//	does.t maintain insertion order
//	duplicate values not allowed
//	stores value in hashtable using hashing
//	allows null value
//	best approach for add,remove,search operation
//	case sensitive
	public static void main(String[] args) {
		Set<String> set = new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Four");
		set.add("five");
		for (String item : set)

		{
			System.out.println(item);
		}
//		Five
//		One
//		Four
//		Two
//		five
//		Three

		System.out.println(set.contains("Four")); // true
		System.out.println(set.isEmpty()); // false

		System.out.println(set.remove("five"));
		for (String item : set)

		{
			System.out.println(item);
		}
//		Five
//		One
//		Four
//		Two
//		Three
	}

}
