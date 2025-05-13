package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {
		super();
	}
	public int countAlpha(String s) throws CharCheckException {
		
		char[] arr = s.toLowerCase().toCharArray();
		
		int count = 0;
		for(char ch : arr) {
			if(ch >= 'a' && ch <= 'z') { //ch,a,z를 숫자로 변환 그래서 a와z사이의 숫자이면 문자임.
				count++;
			}
			if(ch == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
		}
		
		return count;
	}
}
