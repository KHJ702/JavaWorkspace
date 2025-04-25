package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자 : ");
		char p = sc.nextLine().charAt(0);
		int s = p;
		
		System.out.println(p + " unicode : " + s);
		
	}
	
}
