package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	StudentController ssm = new StudentController();

	public StudentMenu() {
		
		System.out.println("========== 학생 정보 출력 ==========");
			Student[] arr = ssm.printStudent(); //동일한 이름의 자료형에다가 저장하고 사용 (얕은 복사를 함)
			for(int i = 0; i <arr.length; i++) {
				System.out.println(arr[i].inform()); //인폼 메서드 출력
			}
		
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력 
		
		
		System.out.println("========== 학생 성적 출력 ==========");
				  // StudentController에 avgScore()를 통해 점수 합계와 평균 출력 
		double[] arr2 = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + arr2[0]);
		System.out.println("학생 점수 평균 : " + arr2[1]);
		
		
		System.out.println("========== 성적 결과 출력 =========="); 
				  // 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력 
		
		for(Student std : arr) {
			System.out.println(std.getName()+"학생은 ");
			if(std.getScore() < StudentController.CUT_LINE ) {
				System.out.println("재시험 대상입니다.");
			} else {
				System.out.println("통과");
			}
			
		}
		
	   }
		
				
	}
	
