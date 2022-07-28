package com.sample.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ArraBlockingQueueDemo {

	public static void main(String[] args) {
//follows array implementation behind
		Queue<Integer> queue = new ArrayBlockingQueue<>(4);
		try {
			queue.add(25);
			queue.add(43);
			queue.add(55);
			queue.add(25);
			queue.add(96);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for (Integer item : queue) {
			System.out.println(item);
		}

//		Queue full
//		25
//		43
//		55
//		25

		Queue<Integer> queue1 = new ArrayBlockingQueue<>(4);
		System.out.println(queue1.offer(265));
		System.out.println(queue1.offer(432));
		System.out.println(queue1.offer(255));
		System.out.println(queue1.offer(2563));
		System.out.println(queue1.offer(966));
		System.out.println(queue1.offer(2085));
//		true
//		true
//		true
//		true
//		false
//		false
		for (Integer item : queue1) {
			System.out.println(item);
		}
//		265
//		432
//		255
//		2563
		
		System.out.println(queue1.peek()); 		//265
		System.out.println(queue1.poll()); 		//265
	}

}
