package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {

		System.out.println("1이상의 숫자 : ");
		int num = sc.nextInt();
			
		if (num < 1) 
		{
			System.out.print("1이상의 숫자를 입력하세요 : ");
			return;
		}
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
		}
	}

	public void practice2() {

		while (true) {
			System.out.print("1이상의 숫자 : ");
			int num = sc.nextInt();
			
			if (num < 1) 
			{
				System.out.print("1이상의 숫자를 입력하세요 : ");
				continue;
			}
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
			}
				break;
			
			/*for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}

			sc.nextLine();

			if (num < 0)
				System.out.print("1 이상의 숫자를 입력해주세요 : ");
			break;*/
		}
	}

	public void practice3() {

		System.out.print("1이상의 숫자 : ");

		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");

		} else {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice4() {

		while (true) {

			System.out.print("1이상의 숫자 : ");

			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				practice4();
				break;
				
			} else {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");
			}
		}
	}
}

	public void practice5() {

		System.out.print("정수를 하나 입력하세요 : ");
		int x = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= x; i++) {
			sum += i;
			System.out.print(i + (i == x ? " = " : "+"));
		}
		
		System.out.println(sum);
		
		
		/* int sum = 0;

		for (int i = 1; i <= x; i++) {
			sum += i;
			System.out.print(i);

			if (x == i) {
				System.out.print(" = ");
			} else {
				System.out.print(" + ");
			}
		}
		System.out.print(sum);*/
	}

	public void practice6() {

		System.out.print("첫 번째 숫자 : ");

		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");

		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if (num2 > num1) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}

	public void practice7() {
		
			System.out.print("첫 번째 숫자 : ");

			int num1 = sc.nextInt();

			System.out.print("두 번째 숫자 : ");

			int num2 = sc.nextInt();
			
			int min = num1 > num2 ? num2 : num1;
			int max = num1 > num2 ? num1 : num2;
			
			for(int i = min; i <= max; i++) {
				System.out.print(i+" ");
				
				if (num1 < 1 || num2 < 1) {
					System.out.println("1 이상의 숫자를 입력해주세요.");
					practice7();
					return;
			

			/*if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				if (num2 > num1) {
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
				} else {
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");*/
					}
				}
	}
	
	public void practice8() {

		System.out.print("숫자 : ");

		int num1 = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d", num1, i, i * num1);
			System.out.println();
		}
	}

	public void practice9() {

		System.out.print("숫자 : ");

		int num1 = sc.nextInt();
		{
			if (num1 >= 10) {
				System.out.print("9 이하의 숫자만 입력해주세요.");

			} else {
				for (int i = 1; i <= 9; i++)
					System.out.printf("%d X %d = %d\n", num1, i, i * num1);
			}

			System.out.println();
		}
	}

	public void practice10() {

					System.out.print("숫자 : ");

			int num1 = sc.nextInt();
			{
				if (num1 >= 10) {
					System.out.print("9 이하의 숫자만 입력해주세요.");
					practice10();
					return;

				} else {
					for (int i = 1; i <= 9; i++)
						System.out.printf("%d X %d = %d\n", num1, i, i * num1);
				}

				System.out.println();
			}
	}

	public void practice11() {

		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();

		System.out.print("공차 : ");
		int d = sc.nextInt();

		//int count = 0;

		//int sum = num;
		
		for(int i = 0; i <10; i++) {
			System.out.print(num + d * i);
		}
		
		/* int count = 0;
		for(int i = num; count < 0 ; num+=d)
			System.out.println(i+" ");
			count++; */
		
		/*while (true) {
			if (count < 10) {
				System.out.print(sum + " ");
				sum += d;
				count++;
			} else {
				break;
			}
		}*/
	}

	public void practice12() {
		while(true) {System.out.print("연산자(+, -, *, /, %)");
		String str = sc.nextLine();
		
		if (str.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		char ch = str.charAt(0);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		if (ch =='/' && num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			continue;
		}
		
		if(!(ch=='/'||ch == '%' || ch == '*' || ch == '+' || ch == '-')) {
			System.out.print("없는 연산자입니다. 다시 입력해주세요.");
			continue;
		}
		
		switch(ch) {
			case '+' : 
				System.out.printf("%d %c %d = %d",num1,ch,num2,num1+num2);
				break;
			case '/' : 
				System.out.printf("%d %c %d = %d",num1,ch,num2,num1/num2);
				break;
			case '-' : 
				System.out.printf("%d %c %d = %d",num1,ch,num2,num1-num2);
				break;
			case '%' : 
				System.out.printf("%d %c %d = %d",num1,ch,num2,num1%num2);
				break;
			case '*' : 
				System.out.printf("%d %c %d = %d",num1,ch,num2,num1*num2);
				break;
		}
	}		
		
		
		/*while (true) {

			System.out.print("연산자(+, -, *, /, %)");
			String str = sc.nextLine();

			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			int result = 0;

			if (str.equals("+")) {
				result = num1 + num2;
			} else if (str.equals("-")) {
				result = num1 - num2;

			} else if (str.equals("*")) {
				result = num1 * num2;

			} else if (str.equals("/")) {
				result = num1 / num2;

			} else if (str.equals("%")) {
				result = num1 % num2;
			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				sc.nextLine();
				continue;
			}
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				sc.nextLine();
				continue;
			}
			System.out.printf("%d %s %d = %d\n", num1, str, num2, result);
			sc.nextLine();
		}*/
	}

	public void practice13() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice14() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i--) {
			for (int j = 1; j <= i; j--) {
				System.out.print("");
				System.out.print("*");
			}
		}
	}

}