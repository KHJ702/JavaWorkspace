package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.mode.vo.*;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("1. 부모타입 참조변수로 부모객체를 다루기");
		Parent p1 = new Parent();
		p1.printParent();
		
		System.out.println("2. 자식타입 참조변수로 자식객체를 다루기");
		Child1 c1 = new Child1();
		c1.printParent();
		c1.printChild1();
		
		System.out.println("3. 부모타입 참조변수로 자식객체를 다루기");
		Parent p2 = new Child1(); // 다형성
		//Parent p3 = new Child2(); // 다형성
		Parent p3 = /* (Parent) */ new Child2(); //업캐스팅
		// 자식에서 부모클래스로 자동형변환 ==> 업캐스팅
		// 상속 관계에서만 적용된다.
		
		((Child1) p2).printChild1(); // 다운캐스팅
		// p2 참조변수로는 Parent에 있는 메서드에만 접근이 가능하므로, Child1 클래스로 강제형변환
		// 시켜주어야, Child1내부의 메서드에 접근 가능하다.
		
		/*
		 * 상속구조의 클래스에서는 형변환이 가능하다.
		 * 
		 * 1. UpCasting
		 *  - 자식타입의 객체가 부모타입으로 형변환 되는 경우
		 *  - 형변환 연산자를 생략해도 자동으로 추가 된다.
		 * 
		 * 2. DownCasting
		 *  - (?슈퍼(super)를 서브로 낮춘다?? 암튼,) 부모타입의 참조변수가 자식타입의 자료형으로 형변환 되는 경우
		 *  - 여러개의 자식타입 중 하나를 직접 기술 해줘야하므로 개발자가 형변환 연산자를 명시적으로 작성해줘야한다.
		 */
		
		// 다형성을 사용하는 이유
		//  - 생산성, 유지보수성에 크게 기여를 하기 때문에 사용
		//  - 부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 부모 클래스 하나로 다룰 수 있기 때문에.
		
		//System.out.println(Object x); <- 다형성이 있기에 오브젝트(최상위 클래스) 사용가능 -> 오브젝트 밑에 있는 것들 다 불러와서 출력가능하다는 뜻 (머리론 알거임)
		
		// 자식객체들을 부모타입 레퍼런스배열로 다루기.
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(4, 5, 6);
		arr[2] = new Child2(7, 8, 9);
		arr[3] = new Child1(7, 0, 2);
		
		for(int i = 0; i < arr.length; i++) {
			// 각 인덱스에 초기화된 자식객체 내부의 printChild메서드 호출하기.
			//((Child1)arr[i]).printChild1(); <- 잘못된 형변환 오류 (왜? arr[0]은 가능, 근데 arr[1]? Child2라서 안됨 (자식끼리는 형변환X)
			
			// instanceof 연산자를 사용
			// 현재 참조변수가 어떤 클래스로 생성되었는지 확인할 수 있는 연산자
//			if (arr[i] instanceof Child1) { //Child1 말고 부모객체(Parent) 넣으면 무조건 true뜨기 때문에 Child1이나 2 넣어야 가능)
//				((Child1)arr[i]).printChild1();
//			} else if(arr[i] instanceof Child2) {
//				((Child2)arr[i]).printChild2();
//			}
			
			arr[i].print();
			/*
			 * 동적바인딩 : 프로그램이 실행되기 전에는 컴파일 단계에서 참조변수의 클래스의 메서드를 실행한다 라고 나와있지만,
			 * 실제 실행시에는 자식객체 내부의 오버라이딩된 메서드를 찾아가서 실행하는 것.
			 * 
			 */
			
		}
		
	}
}
