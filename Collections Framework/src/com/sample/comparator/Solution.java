package com.sample.comparator;

import java.util.Comparator;
import java.util.TreeSet;

class Demo<K, V> {
	private K key;

	private V value;

	public Demo(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Demo [key=" + key + ", value=" + value + "]";
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

public class Solution {

	public static void main(String[] args) {


		Comparator<Demo<Integer, String>> COMPARE_KEY = new Comparator<Demo<Integer, String>>(){

			@Override
			public int compare(Demo<Integer, String> obj1, Demo<Integer, String> obj2) {
				if(obj1.getKey()<obj2.getKey()) {
					return -1;
				}else if(obj1.getKey()>obj2.getKey()) {
					return 1;
				}
				return 0;
			}
			
		};
		
		TreeSet<Demo<Integer, String>> set = new TreeSet<Demo<Integer, String>>(COMPARE_KEY);
		set.add(new Demo(25, "anshu"));
		set.add(new Demo(24, "baby"));
		set.add(new Demo(21, "shruti"));
		set.add(new Demo(28, "honey"));
		for (Demo<Integer, String> item : set) {
			System.out.println(item);
		}
//				Demo [key=21, value=shruti]
//				Demo [key=24, value=baby]
//				Demo [key=25, value=anshu]
//				Demo [key=28, value=honey]
	}

}
