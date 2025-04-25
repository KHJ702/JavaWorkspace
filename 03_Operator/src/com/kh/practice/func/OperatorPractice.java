package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("인원 수 : ");
		int h = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int c = sc.nextInt();
		
		int a = (c/h);
		int b = (c%h);
		//int b = c-(h*a);
		
		System.out.println("1인당 사탕 개수 : " + a);
		System.out.println("남는 사탕 개수 : " + b);

	}
	
  public void practice2() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int a = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int b = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int c = sc.nextInt();
		
		sc.nextLine(); // 버퍼 비워주기
		
		System.out.print("성별(M/F) : ");
		char d = sc.nextLine().charAt(0);
		
		String e = (d == 'M') ? "남학생" : "여학생";
		
		System.out.print("성적(소숫점 아래 둘째자리까지) : ");
		
		double z = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다 %n", a,b,c,e,name,z);
		
  	}
  
  public void practice3() {
		
		System.out.print("나이 : ");
		int a = sc.nextInt();
		
		String result = (a <= 13) ? "어린이" : (a <= 19 ? "청소년" : "성인");
		//String result = (a <= 13) ? (a > 19 ) ? "어린이" : "성인" : "청소년";
		
		System.out.printf(result);
		
	}
  public void practice4() {
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 : ");
		int c = sc.nextInt();
		
		int sum = (a+b+c);
		double avg = (double)(sum/3.0);
		
		boolean result = a >= 40 && b >= 40 && c >= 40 && avg >= 60;
				
		System.out.println(sum);
		System.out.println(avg);	
		System.out.println(result ? "합격" : "불합격");	
		
		/* System.out.println(sum);
		System.out.println(avg);
		
		String result = (a >= 40) && (b >= 40) && (c >= 40) && (avg >= 60) ? "합격" : "불합격";
		
		System.out.printf(result);
		*/
  	}

  public void practice5() {
		
		System.out.print("주민번호를 입력하세요 (- 포함) : ");
		String str = sc.nextLine();
		
		char d = str.charAt(7); // '1' ==> 49
		
		String result = (d=='1') || (d=='3') ? "남자" : "여자";
		
		System.out.printf(result);
		
  }
  
  public void practice6() {
		
	  	System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int enter = sc.nextInt();
		
		boolean result = (num1 >= enter) || (num2 < enter);
				
		System.out.println(result ? true : false);
  }
  
  public void practice7() {
		
	  	System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2) && (num2 == num3);
				
		System.out.println(result ? true : false);
  }
  
  public void practice8() {
		
	  	System.out.print("A사원의 연봉 : ");
		int A = sc.nextInt();
		double A1 = (A+(A*0.4));
		
		String R1 = (A1>=3000) ? "3000 이상" : "3000 미만";
		
		System.out.print("B사원의 연봉 : ");
		int B = sc.nextInt();
		double B1 = (B);
		
		String R2 = (B1>=3000) ? "3000 이상" : "3000 미만";
		
		System.out.print("C사원의 연봉 : ");
		int C = sc.nextInt();
		double C1 = (C+(C*0.15));
		
		String R3 = (C1>=3000) ? "3000 이상" : "3000 미만";
				
		System.out.println("A사원의 연봉/연봉+a : "+A+"/"+A1);
		System.out.println(R1);
		
		System.out.println("B사원의 연봉/연봉+a : "+B+"/"+B1);
		System.out.println(R2);
		
		System.out.println("C사원의 연봉/연봉+a : "+C+"/"+C1);
		System.out.println(R3);
		

  }
  
  
}