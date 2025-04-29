package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;
import com.kh.practice.snack.model.vo.Snack;

public class SnackMenu {
	
	Scanner sc = new Scanner(System.in);
	
	SnackController scr = new SnackController();
	
	public void menu() {
		
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String a = sc.nextLine();
		
		System.out.print("이름 : ");
		String b = sc.nextLine();
		
		System.out.print("맛 : ");
		String c = sc.nextLine();
		
		System.out.print("개수 : ");
		int d = sc.nextInt();
		
		System.out.print("가격 : ");
		int e = sc.nextInt();
		
		//입력한 값을 저장
		String result = scr.saveData(a, b, c, d, e);
		System.out.println(result);
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char f = sc.nextLine().charAt(0);
	
		if(f == 'y' || f == 'Y') {
			String data = scr.confirmData();
			System.out.println(data);
			
	}
	
	}
}
