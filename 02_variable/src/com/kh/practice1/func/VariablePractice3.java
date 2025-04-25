package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		int A = sc.nextInt();
		
		System.out.print("세로 : ");
		int B = sc.nextInt();
		
		int C = (A*B);
		int D = ((A+B)*2);
		
		System.out.println("면적 : " + C);
		System.out.println("둘레 : " + D);
		
	
	}
	
}
