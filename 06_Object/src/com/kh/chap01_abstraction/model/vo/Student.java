package com.kh.chap01_abstraction.model.vo;

public class Student {

	// 속성 / [필드부]
	public String name;
	public int age;
	public double height;

	{ //초기화블럭 // 위에서 바로 public String name ="a" 이것도 가능하나 if~ 이런걸 사용할 수 없기 떄문에 초기화 블럭을 사용함.
		
	 name = "z";
	}
	// 생성자 / 생성자부
	
	// 기능 / 메서드부
	public void study() {
		System.out.println("공부를 합시다");
	}
	
	public void fight(Student s) {
		
		String str = this.name + "학생과 "+s.name+"학생이 싸웁니다";
		
		System.out.println(str);
	
	
	
	}
	
}
