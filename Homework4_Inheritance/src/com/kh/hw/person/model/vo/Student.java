package com.kh.hw.person.model.vo;

public class Student extends Person {

	private int grade; // 학년
	private String major; // 전공

	public Student() {
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Student(String name, int age, int grade, String major) {
		super();
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + ", toString()=" + super.toString() + "]";
	}
	
	
}
