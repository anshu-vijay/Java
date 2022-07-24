package com.sample.generics;

import java.util.LinkedList;
import java.util.List;

class GenericClassExample1<T> {

	// no Typecasting required
	// used for reusablity
	// eliminate typecasting
	// increasing performance
	
	//used where we ant o hangle different types of data at a time
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public GenericClassExample1(T data) {
		this.data = data;
	}

}

public class Solution2 {

	public static void main(String[] args) {
		List<GenericClassExample1<Object>> list = new LinkedList<GenericClassExample1<Object>>();
		list.add(new GenericClassExample1("Some data"));
		list.add(new GenericClassExample1(10));
		list.add(new GenericClassExample1(18.96));
		list.add(new GenericClassExample1(15.3f));
		printList(list);
	}

	static void printList(List<GenericClassExample1<Object>> list) {
		for (GenericClassExample1<Object> listData : list) {
			System.out.println(listData.getData());
		}
	}

}
