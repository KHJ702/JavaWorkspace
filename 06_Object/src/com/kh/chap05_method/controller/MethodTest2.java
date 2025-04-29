package com.kh.chap05_method.controller;

public class MethodTest2 {
	/*static 메서드
	 * 
	 * - static메서드는 사용시 객체를 생성하지 않고도 클래스 이름으로 직접 호출이 가능
	 * - 프로그램 시작시 정적메모리영역(static영역)에 메소드가 저장되어 있기 때문. [stack/heap/static]
	 * - 호출방법 : 클래스명, 메소드명(전달값);
	 * 
	 * 
	 */
	static int count = 0;
	int count2 = 0;

	public static int method(int num1) {
	
		System.out.println("매개변수와 반환형이 존재하는 static메서드");
		/*
		 * static메서드 안에서는 static이 아닌 일반 field멤버 접근이 불가능하다.
		 * why?
		 *  - 변수의 생성시점이 다르기 때문이다. <- 중요!
		 *  - static메서드는 프로그램 시작시 정적메모리 영역에 공간이 할당되는데, 이때 static변수도
		 *    함께 할당되기때문에 static변수는 static메서드가 활용 가능. (생성시점이 같다)
		 *  - 하지만, 일반 전역변수는 객체 생성시점에 메모리에 공간이 할당되므로 static메서드에서 사용이 불가능하다.
		 */
		return num1; //count2; 
	}
	
	public int method1(int num1) {
		return num1 * count; //항상 스태틱이 먼저 메모리에 존재하기 때문에 이거는 가능
		
	 }
	
	}

