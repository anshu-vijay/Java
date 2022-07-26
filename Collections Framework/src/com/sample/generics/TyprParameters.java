package com.sample.generics;

class Example<K, V> {

	private K key;

	private V value;

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public Example(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Example [key=" + key + ", value=" + value + "]";
	}

	public <E, N> void display(E element, N number) {
		System.out.println("Element= " + element + " Number= " + number);
	}

}

public class TyprParameters {

	public static void main(String[] args) {
		Example<Integer, String> obj = new Example(1, "Anshu");
		System.out.println(obj);
		obj.display("Element", 105);
		
//		Example [key=1, value=Anshu]
//		Element= Element Number= 105
	}

}
