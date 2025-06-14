package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {

	/*
	 * 캡슐화
	 *  - 캡슐화는 추상화를 통해 정의된 속성과 기능들을 묶어서 관리하는 기법 중 외부로부터의 직접적인 접근을 막고, 
	 *    객체 내부의 데이터와 기능을 보호하며, 응집도를 높이고 결합도를 낮추는 역할을 한다.
	 *  
	 *  - 객체 내부의 데이터를 반드시 확인/사용 해야 하는 상황이 있을 수 있으므로,
	 *    간접적으로 내부데이터를 처리할 수 있는 메서드를 추가로 작성한다.
	 * 
	 * 1) 정보은닉 : private
	 * 	  필드들을 외부로부터 직접 접근하지 못하도록 할 때 사용.
	 * 
	 * 2) setter / getter 메서드
	 * 	  간접적으로 객체의 필드에 값을 추가하거나, 가져올 수 있는 메서드들.
	 */
	
	public static void main(String[] args) {
		Student nam = new Student();
		nam.setName("남건후");
		nam.setAge(15);
		nam.setHeight(180.5);
		
		System.out.println(nam.getName()); // = "남건후"
		nam.getAge(); // = 15
		nam.getHeight();
		
	}
	
}
