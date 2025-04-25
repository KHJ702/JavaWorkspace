package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("입력");
			break;
		case 2 :
			System.out.println("수정");
			break;
		case 3 :
			System.out.println("조회");
			break;
		case 4 :
			System.out.println("삭제");
			break;
		case 7 :
			System.out.println("종료");
			break;
		default:
			System.out.println("없는");
		}
		System.out.println(" 메뉴 입니다.");
	}
		
	public void practice2() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		
		int num = sc.nextInt();	
		
		/* if(!(num > 0)) {
			System.out.println("양수가 아니다.");
			return;
		} else if (num %2 == 0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다.");
		}
		*/
		
		if ((num>=0) && (num % 2) == 0) {
			System.out.println("짝수다");
		} else if ((num>=0) && (num % 2) == 1) {
			System.out.println("홀수다");
		} else System.out.println("양수만 입력해주세요");
	}
	
	public void practice3() {
		
		System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			
		System.out.print("수학점수 : ");
			int math = sc.nextInt();
			
		System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			
		int sum = (kor+math+eng);
		double avr = (double) ((kor+math+eng)/3.0);
		
		boolean pass = (kor >= 40) && (math >= 40) && (eng >= 40) && (sum >= 60);
		
		if(!pass) {
			System.out.println("불합격입니다.");
			return;
		}
		 { System.out.println("국어 : "+kor);
		   System.out.println("영어 : "+math);
		   System.out.println("수학 : "+eng);
		   System.out.println("합계 : "+sum);
		   System.out.println("평균 : "+avr);
		   System.out.println("축하합니다, 합격입니다!");
		 }
		/*
		 * if (pass) {
		 * 
		 * System.out.println("국어 : "+kor);
		 * System.out.println("영어 : "+math);
		 * System.out.println("수학 : "+eng);
		 * System.out.println("합계 : "+sum);
		 * System.out.println("평균 : "+avr);
		 * System.out.println("축하합니다, 합격입니다!");
		 * 
		 * } else System.out.println("불합격입니다.");
		 */
	}
	
	public void practice4() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int cal = sc.nextInt();
		
		
		switch(cal) {
		 case 1,2,12 :
			System.out.println(cal+"은 겨울입니다.");
		 break;
		 case 3,4,5:
			 System.out.println(cal+"은 봄입니다.");
		 break;
		 case 6,7,8:
			 System.out.println(cal+"은 여름입니다.");
		 break;
		 case 9,10,11:
			 System.out.println(cal+"은 가을입니다.");
		 break;
		 default:
			 System.out.println("해당하는 계절이 없습니다.");
			 return;
		 }

	}
	
	public void practice5() {
		
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String pass = sc.nextLine();
		
	if(id.equals("myId") && pass.equals("myPassword12"))  {
		System.out.println("로그인 성공");
		
	} else if (id.equals("myId")) {
		System.out.println("비밀번호가 틀렸습니다.");
		
	} else if (pass.equals("myPassword12")) {
		System.out.println("아이디가 틀렸습니다.");
	}
		
}
	
	public void practice6() {
		
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String d = sc.nextLine();
		
		if(d.equals("관리자"))  {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			
		} else if (d.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성.");
			
		} else if (d.equals("비회원")) {
			System.out.println("게시글 조회");
		}
		
		/* switch(grade) {
		case "관리자" :
			System.out.println("회원 관리, 게시글 관리");
		case "회원" :
			System.out.println("게시글 작성, 댓글작성");
		case "비회원" :
			System.out.println("게시글 조회");
			break;
		default : 
				System.out.println("존재하지 않는 등급입니다.");
		} */
	
	}
	
	public void practice7() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double a = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double b = sc.nextDouble();
		
		double bmi = b / (a*a);
		System.out.println("BMI 지수 "+bmi);
		
		if(bmi < 18.5)  {
			System.out.println("저체중");
			
		} else if ( bmi < 23) {
			System.out.println("정상체중");
			
		} else if (bmi < 25) {
			System.out.println("과체중");
			
		} else if (bmi < 30) {
			System.out.println("비만");
		} else { 
			System.out.println("고도 비만");
		}
		
		
	}
	public void practice8() {
		
		System.out.print("피연산자 1 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("피연산자 2 입력 : ");
		int b = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		
		char ch = sc.nextLine().charAt(0);
				
		/*
		 * String c = sc.nextLine();
		 * 
		 *  if(c.equals("+") && (a>=0) && (b>=0))  {		
			System.out.println("a + b = " + (a + b));	
			
		} else if (c.equals("-") && (a>=0) && (b>=0)) {
			System.out.println("a - b = " + (a - b));	
			
		} else if (c.equals("*") && (a>=0) && (b>=0)) {
			System.out.println("a * b = " + (a * b));
			
		} else if (c.equals("/") && (a>=0) && (b>=0)) {
			System.out.println("a / b = " + (a / b));
			
		} else if (c.equals("%") && (a>=0) && (b>=0)) {
			System.out.println("a % b = " + (a % b));
			
		} else {
			System.out.println ("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}*/
		
		if (!( ch == '+' || ch == '-' ||ch == '*' ||ch == '/' ||ch == '%')) {
			System.out.println ("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
			}

		System.out.printf("%d %c %d = ",a,ch,b);

		switch(ch) {
		case '+':
			System.out.printf("%d",(a+b));
			break;
		case '-':
			System.out.printf("%d",(a-b));
			break;
		case '*':
			System.out.printf("%d",(a*b));
			break;
		case '/':
			System.out.printf("%f",(double)(a/b));
			break;
		case '%':
			System.out.printf("%d",(a%b));
			break;
		}
		
	}
		public void practice9() {
			
		System.out.print("중간 고사 점수 : ");
			int a = sc.nextInt();
			
		System.out.print("기말 고사 점수 : ");
			int b = sc.nextInt();
			
		System.out.print("과제 점수 : ");
			int c = sc.nextInt();
			
		System.out.print("출석 회수 : ");
			int d = sc.nextInt();
			
			double a1 = (a*0.2);
			double b1 = (b*0.3);
			double c1 = (c*0.3);
			double d1 = (d*1.0);
			
			double t = a1+b1+c1+d1;
			
			System.out.println("===========결과==========");
			
			if (d <= 14) {
				System.out.println("FAIL [출석 횟수 부족] ("+a+"/20)");
				return;
			}
			System.out.println("중간 고사 점수 (20) : " + a1);
			System.out.println("기말 고사 점수 (30) : " + b1);
			System.out.println("과제 점수 (30) : " + c1);
			System.out.println("출석 횟수 (20) : " + d1);
			System.out.println("총점 : " + t);
			if (t >= 70)  {
					System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
	
			/*
			int x = (d/20);
			int y = (int) (a*0.2+b*0.3+c*0.3+x*0.2);
			 
			double a1 = (a*0.2);
			double b1 = (b*0.3);
			double c1 = (c*0.3);
			double d1 = (d*0.2);
			
			double t = (double)a1+b1+c1+d1;
			
			
			System.out.println("===========결과==========");
			
			if ((y >= 70) && (x >= 0.7))  {
				System.out.println("중간 고사 점수 (20) : " + a1);
				System.out.println("기말 고사 점수 (30) : " + b1);
				System.out.println("과제 점수 (30) : " + c1);
				System.out.println("출석 횟수 (20) : " + d1);
				System.out.println("총점 : " + t);
				System.out.println("PASS");
				
			} else if((y < 70) && (x >= 0.7)){
				System.out.printf("FAIL [점수 미달]", t);
				
			} else if((y >= 70) && (x < 0.7)){
				System.out.printf("FAIL [출석 횟수 부족] (%d/20)", d);*/
				
			
		}

		
		public void practice10() {
				
			System.out.println("실행할 기능을 선택하세요.");
			System.out.print("1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n5. 로그인\n6. 권한 확인\n7. BMI\n8. 계산기\n9. P/F\n");
			System.out.print("선택 : ");
			
			int menu = sc.nextInt();
			
			sc.nextLine();
					
			switch(menu) {
			case 1 :
				practice1();
				break;
			case 2 :
				practice2();
				break;
			case 3 :
				practice3();
				break;
			case 4 :
				practice4();
				break;
			case 5 :
				practice5();
				break;				
			case 6 :
				practice6();
				break;
			case 7 :
				practice7();
				break;
			case 8 :
				practice8();
				break;
			case 9 :
				practice9();
				break;
			}

		}
			public void practice11() {
				
				System.out.println("비밀번호 입력(1000~9999) : ");
				
				int pwd = sc.nextInt();
			
				//String str = sc.nextLine();
			
				if (!(pwd >= 1000 && pwd <= 9999)) {
					System.out.println("자리 수 안 맞음");
					return;
				}
				
				//1234
				int first = pwd / 1000; //1.234=>1
				int second = pwd / 100 % 10; // 12 % 10 => 2
				int third = pwd / 10 % 10; // 123.4 => 123 => 12 / 3
				int fourth = pwd %10;
				
				// first 와 second, third, fourth
				// secound와 third, fourth
				// third와 fourth
				
				if( first == second || first == third || first == fourth || second == third || second == fourth || third == fourth) {
					System.out.println("중복 값 있음");
				} else {
					System.out.println("생성 성공");
			}
		}
	}
		


		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	