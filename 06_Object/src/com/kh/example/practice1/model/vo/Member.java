package com.kh.example.practice1.model.vo;

public class Member {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;

	public Member() {
		
	}
	
	public void changeName(String name) {
		
		this.memberName = name; // this 생략가능
	}

	public void printName() {
		System.out.print(memberName);
	}
}
