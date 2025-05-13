package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.charCheck.exception.CharCheckException;
import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		
		System.out.println("정수 1 : ");
		int num1 = sc.nextInt();

		System.out.println("정수 2 : ");
		int num2 = sc.nextInt();
	
		
		
		try {
			boolean result = nc.checkDouble(num1, num2);
			
			} catch (NumRangeException e) {
				e.printStackTrace();
			}
		
		
	
		
		
	}
	
}
