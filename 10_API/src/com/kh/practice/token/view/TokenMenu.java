package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;


public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {
		
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("3. 프로그램 끝내기");
		System.out.println(">>>");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		while(true) {
		switch(menu) {
		case 1: tokenMenu();
		break;
		case 2:	inputMenu();
		break;
		case 3: System.out.println("프로그램을 종료합니다");
		break;
		default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		return;
		}
		
		}
	}

	public void tokenMenu() {
		
		String str = "J a v a P r o g r a m ";
		
		System.out.println("토큰 처리 전 글자 : " +str);
		System.out.println("토큰 처리 전 개수 : "+str.length());
		
		String result = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : "+result);
		System.out.println("토큰 처리 후 개수 : "+result.length());
		
		System.out.println("모두 대문자로 변환 : "+result.toUpperCase());

	}

	public void inputMenu() {
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		String result = tc.firstCap(str);
		System.out.println("첫 글자 대문자 : "+result);
///////////////////////////////////////////////////////////////////
		System.out.println("찾을 문자를 하나 입력하세요 : ");
		String f = sc.nextLine();
		char ch = f.charAt(0);
		
		
		int count = tc.findChar(str, ch);
		System.out.println(ch + " 문자가 들어간 개수 : "+count);

	}
}
