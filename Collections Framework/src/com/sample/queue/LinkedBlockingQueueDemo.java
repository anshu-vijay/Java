package com.sample.queue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedBlockingQueue<>();
		queue.add(25);
		queue.add(43);
		queue.add(55);
		queue.add(25);
		queue.add(96);
		for (Integer item : queue) {
			System.out.println(item);
		}
		
//		25
//		43
//		55
//		25
//		96
		
	System.out.println(queue.element());	//25
	System.out.println(queue.remove());		//25
	for (Integer item : queue) {
		System.out.println(item);
	}
//	43
//	55
//	25
//	96
	
	
	}

}
