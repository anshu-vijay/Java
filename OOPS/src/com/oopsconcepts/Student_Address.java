package com.oopsconcepts;

public class Student_Address {
	private int house_num;
	private String area;
	private String city;
	
	@Override
	public String toString() {
		return "Student_Address [house_num=" + house_num + ", area=" + area + ", cit=" + city + "]";
	}
	public Student_Address() {
		//super();
		this.house_num = 0;
		this.area = "NA";
		this.city = "NA";
	}
	public Student_Address(int house_num, String area, String city) {
		super();
		this.house_num = house_num;
		this.area = area;
		this.city = city;
	}
	public int getHouse_num() {
		return house_num;
	}
	public void setHouse_num(int house_num) {
		this.house_num = house_num;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCit() {
		return city;
	}
	public void setCit(String cit) {
		this.city = cit;
	}
}
