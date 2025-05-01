package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		
		StringTokenizer stn = new StringTokenizer(str," ");
		
		StringBuilder sb = new StringBuilder();
		while(stn.hasMoreTokens()) {
			
			sb.append(stn.nextToken()); //stn.nextToken(); <-이걸로 뽑아온 값을 하나로 이어주면 됌 -> StringBuilder(); 사용
		}
		
		return sb.toString();
	}
	
	public String firstCap(String input) {

		//toUpperCase() : 대문자변환
		
		// 'a' --> 알파벳의 개수만큼 더해주기. --> 'A'
		// 'A' --> 첫글자가 이미 대문자인지 확인 후 변환.
		String result = input.substring(0,1)
				.toUpperCase()
				.concat(input.substring(1)); // 첫번째 글자
		
		return result;
		
	}
	
	public int findChar(String input, char one) {
		
		char[] arr = input.toCharArray();
		int count = 0;
		for (char ch : arr) {
			if (ch == one) {
				count++;
			}
		}
		
		return count;
		
	}
}
