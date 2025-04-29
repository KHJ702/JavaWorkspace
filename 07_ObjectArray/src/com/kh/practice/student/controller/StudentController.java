package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

	Student[] sArr = new Student[5];
	
	public StudentController() {

		sArr[0] = new Student ("김길동", "자바", 100);
		sArr[1] = new Student ("박길동", "디비", 50);
		sArr[2] = new Student ("이길동", "화면", 85);
		sArr[3] = new Student ("정길동", "서버", 60);
		sArr[4] = new Student ("홍길동", "자바", 20);
		
	}
	
	
	public Student[] printStudent() {
		return sArr;
	}
	
	public int sumScore() {
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			sum += i;
	 }
		return sum;
	}
	public Double[] avgScore() {
		Double[] d = new Double[2];
		
		d[0]=(double) sumScore();
		d[1]=(double) (sumScore()/2);
		
		return d;
	}
	
}
