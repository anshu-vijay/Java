package com.sample.linkedlist;

public class Student {
	private int sid;
	private String fullname;
	private double percentage;

	public Student(int sid, String fullname, double percentage) {
		super();
		this.sid = sid;
		this.fullname = fullname;
		this.percentage = percentage;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}
