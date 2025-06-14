package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {

	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	

	public void mainMenu() {
		
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		
		int num1 = sc.nextInt();
		
		switch (num1) {
		case 1 : circleMenu();
			break;
		case 2 : rectangleMenu();
			break;
		case 9 : System.out.println("종료합니다.");
			return;
		default : System.out.println("잘못 입력했습니다.");
		}
			
	}

	public void circleMenu() {
		
	while(true) {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		int num2 = sc.nextInt();
		
		switch (num2) {
		case 1 : calcCircum();
			break;
		case 2 : calcCircleArea();
			break;
		case 9 : 
			return;
		
		}
	  }
	}
	public void rectangleMenu() {
	
		while(true) {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		int num2 = sc.nextInt();
		
		switch (num2) {
		case 1 : calcPerimeter();
			break;
		case 2 : calcRectArea();
			break;
		case 9 : 
			return;
		}
	}
	}
	public void calcCircum() {
		
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("반지름 : ");
		int num3 = sc.nextInt();

		String result1 = cc.calcCircum(num1,num2,num3);
		System.out.println(result1);
		
	}

	public void calcCircleArea() {
		
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("반지름 : ");
		int num3 = sc.nextInt();

		String result2 = cc.calcArea(num1,num2,num3);
		System.out.println(result2);
	
	}

	public void calcPerimeter() {
		
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("높이 : ");
		int num3 = sc.nextInt();
		System.out.print("너비 : ");
		int num4 = sc.nextInt();

		String result3 = rc.calcPerimeter(num1,num2,num3,num4);
		System.out.println(result3);
	
	}
	
	public void calcRectArea() {
		
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("높이 : ");
		int num3 = sc.nextInt();
		System.out.print("너비 : ");
		int num4 = sc.nextInt();

		String result4 = rc.calcPerimeter(num1,num2,num3,num4);
		System.out.println(result4);
		
	}
	
}
