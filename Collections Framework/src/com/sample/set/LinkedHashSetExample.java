package com.sample.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
//	maintain insertion order
//	duplicate values not allowed
//	allows one null key
//	2nd best approach for add,remove,search operation
	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
		for (String item : set)
		{
			System.out.println(item);
		}
//		One
//		Two
//		Three
//		Four
//		Five
	}
}
