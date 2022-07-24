package com.sample.generics;

public class Solution1 {

	public static void main(String[] args) {
		Data data = new Data("Some Data 1");
		String value1 = (String) data.getName();
		// Typecasting takes more time
		System.out.println(value1);	//Some Data 1

		GenericClassExample<String> genData1 = new GenericClassExample<String>("Some Generic Data 1");
		String value2 = genData1.getName();
		//no Typecasting required
		//used for reusablity
		//eliminate typecasting
		//increasing performance
		System.out.println(value2);	//Some Generic Data 1
	}

}

class GenericClassExample<T> {
	private T name;

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public GenericClassExample(T name) {
		this.name = name;
	}

}

class Data {
	private Object name;

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public Data(Object name) {
		this.name = name;
	}

	public Object getName() {
		return name;
	}

	public void setName(Object name) {
		this.name = name;
	}

}
