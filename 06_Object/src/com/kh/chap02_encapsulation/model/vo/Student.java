package com.kh.chap02_encapsulation.model.vo;

public class Student {
	// 필드 == 멤버변수 == 인스턴스변수 == 속성
	private String name;
	private int age;
	private double height;

	// 메서드부
	// 각 객체의 기능을 구현
	// [표현법]
	// 접근제한자 [예약어] 반환형(void(void는 돌려줄 값이 없다는 뜻)) 메서드명(매개변수 ex.(String str)(함수 내에서 지역변수처럼 사용))  {
	//	실행 할 코드
	//
	//}
	public void study() {
		System.out.println(name+"이 공부합니다.");
	}
	// setter / getter 메서드 구현
	// setter메서드
	public void setName(String name) { //(변수명은 필드명과 똑같이(관례)
		this.name = name; //현재 객체의 필드의 name을 얻어옴 (this.= 현재 이 메소드를 실행하고 있는 객체의 name이라는 인스턴스 변수의 값을 가져와라)
}
	public void setAge(int age) {
		this.age = age;
}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// getter메서드
	// 객체 내부의 필드값을 반환해주는 메서드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	
	// 모든 필드 값을 하나의 문자열로 합쳐서 반환하는 메서드
	public String information() {
		return name+"님의 나이는"+age+"살이고, 키는 "+height+"cm입니다."; // 이거는 public String(문자열로 반환한다) 이렇게 했기 때문에 가능함.
		
		
	}
	
}
