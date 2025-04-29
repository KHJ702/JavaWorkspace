package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	public int[] personcount() {
		return e;
	}
	
	public void insertStudent (String name, int age, int grade, String major) {
		
		s[0] = new Student (name, age, grade, major);
		s[1] = new Student (name, age, grade, major);
		s[2] = new Student (name, age, grade, major);
		
	}
	
	public Student[] printStudent() {
	}

	public void insertEmployee (String name, int age, int salary, String dept) {
		
	}
	
	public  Employee[] printStudent() {
	}
	
}
