package com.sample.comparable;

public class Student implements Comparable<Student>{
	private int sid;
	private String fullname;
	private double percentage;

	public Student(int sid, String fullname, double percentage) {
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

	@Override
	public int compareTo(Student obj) {
		if(fullname.equals(obj.fullname)) {
			return 0;
		}
		else if (fullname.compareTo(obj.fullname)<0) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
