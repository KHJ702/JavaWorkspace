package com.kh.chap03_wrapper.run;

public class Run {
	
	/*
	 * Wrapper 클래스
	 * 	-> 기본 자료형을 객체로 포장해주는 클래스
	 * 	-> 기본 자료형을 객체로 만들어서, 필요한 메서드를 호출할 수 있다.
	 * 
	 * 	기본 자료형 <-----------> Wrapper 클래스
	 * 	 boolean               Boolean
	 * 	 char				   Character
	 * 	 byte				   Byte
	 * 	 short				   Short
	 * 	 int				   Integer
	 * 	 long				   Long
	 * 	 float				   Float
	 * 	 double				   Double
	 */

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 == num2);
		// System.out.println(num1.equals(num2));
		// 일반 자료형에는 메서드가 없으므로, 각 객체자료형의 메서드를 활용하고자 한다면 Wrapper클래스로 변환 해야한다.
		
		// 기본자료형 => Wrapper로 변환
		// Boxing
		Integer i1 = num1; //위의 값이 고대로 들어감 (상속 관계도 아닌 것이 대입연산자가 다른데 그냥 들어감(Integer<->int)
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i1.compareTo(i2)); // i1 > i2 ?
		// a.compareTo(b) : a가 b보다 크면 1, b가 크면 -1, 같으면 0을 반환하는 함수. 
		//(문자열과 문자열 간의 크기(가,나 <- 이런거) 비교 가능 왜? 아스키 코드 상으로 비교함 가<나) 
		
		// Wrapper -> 기본자료형(자동형변환)
		// unBoxing		
		int num3 = i1;
		int num4 = i2;
		
		// 기본자료형 <----> String
		// 문자열을 기본자료형으로 파싱하는 방법들
		
		String str1 = "10"; //<-여기다 "ㅋ"이나"10.0"넣으면 불가 무조건 정수형! // "10" => 10
		String str2 = "15.3"; // "15.3" => 10
		
		// 변환하고자하는 자료형의 Wrapper클래스를 이용하여 parse
		
		int i = Integer.parseInt(str1); // 정수형태의 문자열이 아닌 경우 에러 발생.
		double d = Double.parseDouble(str2);
		
		System.out.println(i+d);
		
	}

}
