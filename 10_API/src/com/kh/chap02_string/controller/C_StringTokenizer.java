package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizer {
	
	
	// StringTokenizer : 문자열을 구분자를 기준으로 토큰단위로 불리시키는 클래스.
	public void method() {

		String str = "Java,Oracle,JDBD,HTML,Server";
		
		// 구분자를 통해 문자열을 분리시키는 방법
		// 1. String의 split()메서드를 이용하는 방법
		//	  문자열.split(구분자) : String[]
		//	  너무 큰 문자열을 구분할 경우, 메모리 부족 에러가 발생할 수 있다.
		String[] arr = str.split(","); // ["java","Oracle","JDBD","HTML","Server"]
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		// 2. StringTokenizer클래스를 이용하는 방법
		// 	  StringTokenizer stn = new StringTokenizer(문자열,구분자);
		
		StringTokenizer stn = new StringTokenizer(str,",");
		
		System.out.println("분리된 문자열의 갯수 : " +stn.countTokens());
		// (카운트토큰 갯수만큼 반복문 돌려서 꺼내주어야함(?>))
		// stn.countTokens() 현재, 남은 토큰의 갯수를 반환하기 때문에 일반 반복문에서 사용불가.
		// (countTokens 꺼낼때 마다 하나씩 줄어듬 그래서 i=3 이고 stn.countTokens()=2 라서 false. 그래서 3개만 나옴)
		
		/* for(int i = 0; i < stn.countTokens(); i++) { // 소모성 (countTokens 꺼낼때 마다 하나씩 줄어듬 그래서 i=3 이고 stn.countTokens()=2 라서 false. 그래서 3개만 나옴)
			System.out.println("현재 토큰의 문자열 : "+stn.nextToken());
		} */
		
		// stn.hasMoreTokens() => 토큰
		while( /*(stn.countTokens() > 0)*/ stn.hasMoreTokens()) {
			System.out.println("현재 토큰의 문자열 : "+stn.nextToken());
		}
		
		// StringTokenizer는 재사용이 불가능 하다.
		
	}

}
