package com.sample.dequeue;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedDequeueDemo {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedBlockingDeque<>();
		deque.add(25);
		deque.add(43);
		deque.add(55);
		deque.add(25);
		deque.add(96);
		System.out.println(deque.offer(94)); 	//true
		for (Integer item : deque) {
			System.out.println(item);
		}
//		25
//		43
//		55
//		25
//		96
//		94
		System.out.println(deque.size()); //6	
		deque.addFirst(01);
		deque.addLast(100);
		System.out.println(deque.getLast()); 	//100
		System.out.println(deque.peek()); 		//1
		System.out.println(deque.getFirst());	//1
		for (Integer item : deque) {
			System.out.println(item);
		}
		
//		1
//		25
//		43
//		55
//		25
//		96
//		94
//		100

	}

}
