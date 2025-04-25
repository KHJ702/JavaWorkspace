package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("국어 : ");
		double a = sc.nextDouble();		
		
		System.out.print("영어 : ");
		double b = sc.nextDouble();		
		
		System.out.print("수학 : ");
		double c = sc.nextDouble();	
		
		System.out.printf("총점 : %d\n", (int)(a+b+c));
		System.out.printf("평균 : %d", (int)(a+b+c)/3);

	}
	
}

