package com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		System.out.println("========== KH 사이트 =========="); 
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 같은 이름 회원 찾기");
		System.out.println("9. 종료");
		
		int menu = sc.nextInt();
		
		sc.nextLine();
		
		switch(menu) {
		
		case 1 : joinMembership();
			break;
		case 2 : logIn();
			break;
		case 3 : sameName();
			break;
		case 9 : System.out.println("프로그램 종료");
			return;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		
		}
	}
	
	public memberMenu() {

		System.out.println("******* 회원 메뉴 *******");
		System.out.println("1. 비밀번호 바꾸기");
		System.out.println("2. 이름 바꾸기");
		System.out.println("3. 로그아웃");
		
		int menu = sc.nextInt();

		sc.nextLine();
		
		switch(menu) {
		
		case 1 : changePassword();
			break;
		case 2 : changeName() ;
			break;
		case 3 : System.out.println("로그아웃 되었습니다.");
			mainMenu();
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			return;
		}
		
	}
	
	public void joinMembership() {
		
	}
	
	public void logIn() {
		
	}
	
	public void changePassword() {
		
		String pass = sc.nextLine();
		
		mc.changePassword(null, null, pass);
		
	}
	
	public void changeName() {
		
	}
	
	public void sameName() {
		
	}
	
}
