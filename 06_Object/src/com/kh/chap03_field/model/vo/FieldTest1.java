package com.kh.chap03_field.model.vo;

	public class FieldTest1 {
	/*
	 * 변수 구분 (두 변수를 보관하는 영역이 아예 다르다)
	 * - 전역변수 : 클래스 영역 바로 아래에 선언하는 변수들
	 * 			  클래스내 어디서든 사용 가능
	 * - 지역변수(lv) : 클래스 영역 내에서 특정영역 ({})에 선언한 변수.
	 * 			  선언한 지역에서만 사용 가능. (메서드, 
	 * 
	 * 1. 전역변수
	 *  - 필드 == 인스턴스 변수(iv) == 멤버변수
	 *    생성시점 : 객체가 메모리에 할당되면 함께 생성.
	 *    소멸시점 : 객체가 소멸할 때 함께 소멸
	 *    
	 *  - 클래스 변수(cv) == static 변수
	 *    생성시점 : 프로그램 시작과 동시에 static영역에 메모리 할당
	 *    소멸시점 : 프로그램 종료시
	 * 
	 * 2. 지역변수
	 *    생성시점 : 특정영역({})이 실행될 때 할당
	 *    소멸시정 : 특정구역이 종료될 때 소멸
	 */

	private int global; // 전역변수는 JVM이 알아서 초기화 시켜줌
	
	public void test(int num) { // 매개변수 int자료형으로 만들어진 num
		
		int local = 0; // 지역변수를 사용할 때는 초기화를 항상 시켜줘야 한다.
		
		if(true) {
			int a = 0;
		}
		
		// test메서드를 사용하기 위해, FieldTest1객체를 생성하게 되면, global필드에는 항상 값이 초기화된다(JVM)
		System.out.println(global);
		System.out.println(local);
		System.out.println(num);
		//System.out.println(a);
		
	}
	
	
	{
		FieldTest2 ft2 = new FieldTest2();
		// 같은 패키지에는 default, protected 접근 가능.
		System.out.println(ft2.df);
		System.out.println(ft2.pro);
		System.out.println(ft2.pub);
	}
	
	
	}
	
	

	
