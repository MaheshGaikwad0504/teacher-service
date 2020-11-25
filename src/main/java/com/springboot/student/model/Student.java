package com.springboot.student.model;

public class Student {

	int studentId;
	String name;
	String address;
	int marks;

	public Student() {
	}

	public Student(int studentId, String name, String address, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
