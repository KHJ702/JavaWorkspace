package com.kh.chap02_string.controller;

public class D_StringMethods {


	public void method() {
		
		String str1 = "Hello World";
		
		// : char , : String .... <-반환형이라는 뜻
		
		// 1. 문자열.charAt(int index) : char
		char ch = str1.charAt(6); // 'W'
		System.out.println("ch : "+ch);
		
		// 2. 문자열.concat(String str) : String
		//	  문자열과 전달된 또다른 문자열을 하나로 합쳐서 반환 하는 함수.
		// (메서드만 사용해서 문자열을 합쳐야 할때 사용 보통은 + 로 이어서 씀, 그닥 많이 안쓰는듯?)
		String str2 = str1.concat("!!!!");
		System.out.println("str2 : "+str2);
		
		// 3. 문자열.length() : int
		System.out.println("str1의 길이 "+str1.length());
		
		// 4. 문자열.substring(int beginIndex) : String
		//	  문자열.substring(int beginIndex, int endindex) : String
		//	  beginIndex에서부터 endIndex -1 (endIndex가 있으면 여기까지, 아니면 끝까지) 혹은, 끝까지 문자열을 추출해서 리턴.
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0,6));//0~5까지 추출됌 왜? 위에서 -1 이랬음
		
		// 5. 문자열.replace(char old, char new) : String
		//	  문자열에서 old문자를 new문자로 변환한 문자열을 반환.
		String str3 = str1.replace('l', 'c'); //l을 c로 바꾸것다
		System.out.println("str3 : "+str3);
		
		// 6. 문자열.trim() : String
		//		=> 잘라냄 , 양 쪽 끝의 공백을 잘라내는 메서드
		String str4 = "      rlaguswn     ";
		System.out.println("trim() : "+str4.trim());
		
		// 7. 문자열.toUpperCase() : String
		//	  문자열.toLowerCase() : String
		//	  문자열을 대문자, 소문자로 변경 후 리턴.
		System.out.println("upper : "+str1.toUpperCase());
		System.out.println("lower : "+str1.toLowerCase());
		
		// 8. 문자열.toCharArray() : char[]
		// 문자열의 각 문자들을 char[]로 반환해주는 함수
		char[] arr = str1.toCharArray();
		
		// v > 캐릭터 배열에 들어가있던 문자들이 문자열로 반환 > v
		
		// 9. static valueOf(자료형) : String
		//	  전달된 자료형의 값을 문자열로 반환해주는 메서드
		//	  1 -> "1" -> 1+""
		System.out.println(String.valueOf(arr));
		
		// 불변인자는 주소값이 안바뀌는 것.
		
	}
	
}
