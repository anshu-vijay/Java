package com.oopsconcepts;

public class Student_pojo {
private int sid;
private String fullname;
//composition
private Student_Address address;

public Student_pojo(int sid, String fullname, Student_Address address) {
	super();
	this.sid = sid;
	this.fullname = fullname;
	this.address = address;
}

public Student_pojo() {
	//super();
	this.sid = 0;
	this.fullname = "NA";
	this.address = null;
}

@Override
public String toString() {
	return "Student_pojo [sid=" + sid + ", fullname=" + fullname + ", address=" + address + "]";
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

public Student_Address getAddress() {
	return address;
}

public void setAddress(Student_Address address) {
	this.address = address;
}
}
