package com.kh.chap01_abstraction.run;

import com.kh.chap01_abstraction.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		/*
		 * 1. 객체지향언어 : 객체를 중심으로 객체간의 상호작용을 통해 작동하는 프로그래밍 방식.
		 * 				 (현실 세계에 존재하는 사물이나 개념을 객체라는 단위로 표현하고, 이들 객체 간의 상호작용을 통해 프로그램을 구성하는 방식)
		 * 2. 객체 : 클래스(설계도)를 통해 메모리 영역(heap)에 저장공간이 할당된 데이터 (생성 된 것).
		 * 
		 * 3. 구현하고자 하는 프로그램상의 목적에 맞는 객체를 만드는 방법
		 * 
		 * 4. 클래스는 객체의 속성과 기능을 담아내는 그릇
		 * 
		 * 5. 추상화 & 캡슐화 과정이 필요
		 * - 추상화 : 내가 구현하고자 하는 프로그램의 목적에 맞는 객체를 선정 후, 그 객체들이
		 *    	    가지고 있을 핵심적인 역할의 속성과 기능만 남기는 행위.
		 * => 중요 속성들을 접근할 수 없게 만드는 것 = 캡슐화(private)
		 */
		
		// 추상화
		
		// 1. 학생객체
		// 홍길동 학생 객체 만들기
		Student hong = new Student(); //new 뒤에 있는 Student <-이게 생성자 (그리고 객체가 생성 되면서 Heap 메모리 상에 저장공간 할당됨)
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 180.5;
		
		Student tae = new Student();
		tae.name = "안태형";
		tae.age = 26;
		tae.height = 175.0;
		
		tae.fight(hong);
		
		System.out.println(hong.name+""+hong.age+""+hong.height);
		System.out.println(tae);
	}
}
