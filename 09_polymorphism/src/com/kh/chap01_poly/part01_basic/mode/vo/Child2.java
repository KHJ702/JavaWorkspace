package com.kh.chap01_poly.part01_basic.mode.vo;

public class Child2 extends Parent{

	private int n;
	
	public Child2() {
		
		
	}
	
	public Child2(int x, int y, int n) {
		super(x,y);
		this.n = n;
		
	}
	
	public void printChild2() {
		System.out.println("자식2 입니다.");
	}
	
	@Override
	public void print() {
		System.out.println("자식클래스 2에서 실행한 오버라이드 메서드");
	}
}
