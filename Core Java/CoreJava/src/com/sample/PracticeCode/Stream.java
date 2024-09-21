package com.sample.PracticeCode;

import java.util.ArrayList;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2);

		System.out.println("-----Distinct Sort------");
		list.stream().distinct().sorted().forEach(System.out::println);
		
		System.out.println("-----Reverse Sort------");
		list.stream().distinct().sorted((a, b) -> b - a).forEach(System.out::println);
		
		System.out.println("-----Filter----");
		list.stream().distinct().filter(n -> n > 2).sorted().forEach(System.out::println);
		
		System.out.println("-----Reduce----");
		int sum = list.stream().distinct().filter(n -> n > 2).reduce(0, Integer::sum);
		System.out.println(sum);
		
		System.out.println("-----Map----");
		list.stream().distinct().filter(n -> n > 2).map(n -> Math.pow(n, 2)).sorted().forEach(System.out::println);

	}

}
