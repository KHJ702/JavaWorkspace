package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	
	Scanner sc =  new Scanner(System.in);
	
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();

	public void inputMenu() {
		while(true) {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형\n4. 사각형\n9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		
		int b = sc.nextInt();
		
		switch(b) {
		case 3:
			 triangleMenu();
			 break;
		case 4:
			 squareMenu();
			 break;
		case 9:
			 System.out.println("프로그램 종료");
			 return;
		default:
			 System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
		  }
	   }
   }
		/*if (b == 3) {
			triangleMenu();
		} else if (b == 4) {
			squareMenu();
		} else { 
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			return;
		}*/
	
	public void triangleMenu() {
		while(true) {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적\n2. 삼각형 색칠\n3. 삼각형 정보\n9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		int b = sc.nextInt();
		
		switch(b) {
		case 1:
			inputSize(3,1);
			 break;
		case 2:
			inputSize(3,2);
			 break;
		case 3:
			printInformation(3);
			 break;
		case 4:
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
			return;
		default:
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
		  }
	   }
   }
		
		/*if (b == 1) {
			inputSize(3,1);
		} else if (b == 2) {
			inputSize(3,2);
		} else if (b == 3) {
			printInformation(3);
		} else if (b == 9) { 
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		} else {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			return;
		}*/

	public void squareMenu() {
	
		while(true) {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레\n2. 사각형 면적\n3. 삼각형 색칠\n4. 삼각형 정보\n9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		int b = sc.nextInt();
		sc.nextLine();
		
		switch(b) {
		case 1:
			inputSize(4,1);
			break;
		case 2:
			inputSize(4,2);
			break;
		case 3:
			inputSize(4,4);
			break;
		case 4:
			printInformation(4);
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
		  }
		
		/*if (b == 1) {
			inputSize(4,1);
		} else if (b == 2) {
			inputSize(4,2);
		} else if (b == 3) {
			inputSize(4,4);
		} else if (b == 4) {
			printInformation(4);
		} else if (b == 9) { 
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		} else {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			return;
		}*/
	  }
	}
	
	public void inputSize(int type, int memuNum) {
		
					
			if(type==3 && memuNum==1) {
				System.out.print("높이 : ");
				double a = sc.nextDouble();
				
				System.out.print("너비 : ");
				double b = sc.nextDouble();
				
				System.out.println("삼각형 면적 : " +tc.calcArea(a, b));
		}
		
			if(type==3 && memuNum==2) {
				sc.nextLine();
				
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				
				tc.paintColor(color);
				
				System.out.println("색이 수정되었습니다");
		}
			
			if(type == 4 && memuNum == 1) {
				System.out.print("높이 : ");
				double a = sc.nextDouble();
				
				System.out.print("너비 : ");
				double b = sc.nextDouble();
				
				scr.calcPerimeter(a, b);
				
		}
			if(type == 4 && memuNum == 2) {
				System.out.print("높이 : ");
				int a = sc.nextInt();
				
				System.out.print("너비 : ");
				int b = sc.nextInt();
				
				scr.calcArea(a, b);
		}
			if(type == 4 && memuNum == 3) {
				
				sc.nextLine();
				
				System.out.print("색깔을 입력하세요 : ");
				String a = sc.nextLine();
				
				scr.paintColor(a);
				
				System.out.println("색이 수정되었습니다");
			}
	}
	
	public void printInformation(int type) {
		
		if (type == 3) {
			String result = tc.print();
			System.out.println(result);
			
			} else if (type == 4) {
				System.out.println(scr.print());
			}
	}
	
}
