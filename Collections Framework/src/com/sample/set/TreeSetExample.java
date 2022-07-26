package com.sample.set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
//		maintains ascending order.
//		duplicate values not allowed
//		stores value in hashtable using hashing
//		doesn't allow null value
//		slower approach for add,remove,search operation
//		access and retrieval times are quiet fast.

		TreeSet<Integer> set=new TreeSet<Integer>();    
        set.add(24);    
        set.add(66);    
        set.add(12);    
        set.add(15); 
		for (Integer item : set) {
			System.out.println(item);
		}
//		12
//		15
//		24
//		66
		
        System.out.println("Initial Set: "+set);  
        
        System.out.println("Reverse Set: "+set.descendingSet());  
          
        System.out.println("Head Set: "+set.headSet(33, true));  
         
        System.out.println("SubSet: "+set.subSet(10, false, 30, true));  
          
        System.out.println("TailSet: "+set.tailSet(20, false));
        
//        Initial Set: [12, 15, 24, 66]
//        		Reverse Set: [66, 24, 15, 12]
//        		Head Set: [12, 15, 24]
//        		SubSet: [12, 15, 24]
//        		TailSet: [24, 66]
        
        
        System.out.println("Lowest Value: "+set.pollFirst());    
        System.out.println("Highest Value: "+set.pollLast());    
        for (Integer item : set) {
			System.out.println(item);
		}
//        Lowest Value: 12
//        Highest Value: 66
//        15
//        24
        
 
		
	}

}
