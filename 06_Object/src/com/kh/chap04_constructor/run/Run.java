package com.kh.chap04_constructor.run;

import com.kh.chap04_constructor.model.vo.User;

public class Run {
public static void main(String[] args) {
	
	User user = new User(); //얘는 기본생성자 호출한거고
	
	User user2 = new User("user01",20,'남'); //얘는 3개 초기화 값에 그 생성자 호출한 것
	
}		
	}

