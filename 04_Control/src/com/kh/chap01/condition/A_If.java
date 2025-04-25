package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 프로그램의 실행 순서. 
	 * 
	 * 선택적으로 특정 라인을 실행시키고자 할때 => 제어문.
	 * 반복적으로 실행해야 하는 코드 => 반복문.
	 * 반복문 내부 흐름을 제어하는 경우 => 분기문.
	 * 
	 * 
	 * if(조건문)
	 * 조건문 : 조건식을 활용하여 true/false값이 나오도록 설정하는 식
	 */
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		/*
		 * 단독 if문
		 * [표현법]
		 * if(조건식) 조건식이 참일 때 실행할 코드 하나
		 */
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if (num > 0) { // {} 코드 여러줄을 하나로 묶어서 실행하는 연산자
			System.out.println("양수다");
			System.out.println("양수다");
			System.out.println("양수다");
		}
		
		if (num <= 0) System.out.println("양수가 아니다");
	}

	public void method2() {
		/* <if는 조건을 만족하면 그 즉시 실행하고 빠져나옴>
		 * if ~ else문
		 * [표현법]
		 * if(조건식) {
		 * 조건식이 결과가 참이라면 실행할 코드들;
		 * }else{
		 * 조건식이 결과가 거짓이라면 실행할 코드들;
		 */
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if (num > 0) { // {} 코드 여러줄을 하나로 묶어서 실행하는 연산자
			System.out.println("양수다");
		 } else {
			System.out.println("양수가 아니다");
		}
	}
	
	public void method3() {
		/*
		 * if ~ else if문
		 * 같은 비교대상으로 여러개의 조건을 제시해야하는 경우 사용.
		 * [표현법]
		 * if(조건식 1) 조건식 1이 참이라면 실행할 코드;
		 * else if (조건식 2) 조건식 2가 참이라면 실행할 코드;
		 * else if (조건식 3) 조건식 3이 참이라면 실행할 코드;
		 * ...
		 * [else 조건식이 결과가 거짓이라면 실행할 코드] //생략가능
		 */
		 
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if (num > 0) { 
			System.out.println("양수다");
		} else if(num == 0) {
			System.out.println("0이다");
		} else /*if (num<0)*/ {
			System.out.println("음수다");
		}
	}
	
	public void method4() {
		// 사용자가 입력한 값을 가지고 어린이/청소년/성인/어르신 출력
		// 어린이 (13세 이하), 청소년 (13세 초과 19세 이하),
		// 어른 (성인 19세 초과 60세 이하) / 어르신 (60세 초과)
		//if ~ else if로 변경	
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			int a = 0; // if문 블럭 안에서 선언한 변수는 if문 안에서만 사용 가능.
			System.out.println("어린이");
		} else if(age <= 19) {
				System.out.println("청소년");
		} else if(age <= 60) {
				System.out.println("성인");
		} else {
				System.out.println("어르신");
		}
	}
	
	public void method5() {
		// 성별과 이름을 입력받아, 이름과 남자인지 여자인지를 출력
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = ""; // 남자 혹은 여자
		// 변수는 항상 초기화 시키는게 좋다.
		if(gender == 'm' || gender == 'M') {
			result = "남자";
		} else if(gender == 'f' || gender == 'F') {
			result = "여자";
		} else {
			result = "중성";
		}
		System.out.println(name+"님은 "+result);
	}

	public void method6() {
		// 사용자에게 이름을 입력받고, 이 이름이 본인 이름과 일치하는지 비교
		System.out.print("본인 이름 : ");
		String name = sc.nextLine();
		
		// 참조자료형은 동등비교시 정상적으로 비교가 안된다. (== 사용 불가)
		if(name == "김현주") {
			System.out.println("김현주님 반갑습니다");
		} else {
			System.out.println("누구세요 ?");
	}
	// 문자열 동등비교를 위한 메서드
	// 문자열.equals(비교문자열)
		
		if(name.equals("김현주")) /*==("김현주".equals(name))*/ {
			System.out.println("환영합니다!");
		} else {
			System.out.println("누구세요?");
	}
		
	}
}







