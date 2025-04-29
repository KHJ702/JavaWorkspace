package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

	private Student[] sArr = new Student[5];
	public final static int CUT_LINE = 60; //?
	
	public StudentController() {
		// 기본생성자에서 배열초기화 완료 (StudentController가 관리하고 있는 필드에서 초기화 완료)
		sArr[0] = new Student ("김길동", "자바", 100);
		sArr[1] = new Student ("박길동", "디비", 50);
		sArr[2] = new Student ("이길동", "화면", 85);
		sArr[3] = new Student ("정길동", "서버", 60);
		sArr[4] = new Student ("홍길동", "자바", 20);
		
	}
	
	public Student[] printStudent() {
		return sArr; // 1. (StudentController)에서 학생 정보 초기화 2. 반환
	}
	
	public int sumScore() {
		
		int sum = 0;
		
		for(int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
	 }
		return sum;
	}
	public double[] avgScore() {
		Double[] d = new Double[2];
		
		d[0] = (double) sumScore(); // 점수 총 합계
		d[1] = (double) (d[0] / 5.0);
		return null;

	}
	
}
