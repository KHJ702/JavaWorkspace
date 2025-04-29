package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 %d명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 %d명입니다.");
		
		System.out.println("1. 학생 메뉴");
		System.out.println("2. 사원 메뉴");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int num1 = sc.nextInt();
		
		switch(num1) {
		case 1: studentMenu();
		break;
		case 2:	employeeMenu();
		break;
		case 3: System.out.println("종료합니다");
		break;
		default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		return;
		}
		
	}
	public void studentMenu() {
		
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num1 = sc.nextInt();
		
		switch(num1) {
		case 1: insertStudent();
		break;
		case 2:	printStudent();
		break;
		case 3: System.out.println("종료합니다");
		break;
		default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		return;
		}
		
	}
	public void employeeMenu() {
		
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num1 = sc.nextInt();
		
		switch(num1) {
		case 1: insertStudent();
		break;
		case 2:	printStudent();
		break;
		case 3: System.out.println("종료합니다");
		break;
		default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		return;
		}
		
	}
	public void insertStudent() {
		
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();
		System.out.print("학생 나이 : ");
		String age = sc.nextLine();
		System.out.print("학생 학년 : ");
		String grade = sc.nextLine();
		System.out.print("학생 전공 : ");
		String major = sc.nextLine();
		
		if() {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		} else if {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
		} else if {
			System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");

		}
		
		Student[] result1 = pc.insertStudent(name, age, grade, major);
		System.out.println(result1);
		
	}
	public void printStudent() {
		
		Student[] arr = pc.printStudent();
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i].);
		
	}
	}
	public void insertEmployee() {
		
		
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("사원 나이 : ");
		String age = sc.nextLine();
		System.out.print("사원 급여 : ");
		String grade = sc.nextLine();
		System.out.print("사원 부서 : ");
		String major = sc.nextLine();
		
		if() {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		} else if {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
		} else if {
			System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
		}
	}
	
	public void printEmployee() {
		
	}
}
