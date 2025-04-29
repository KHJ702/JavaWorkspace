package com.kh.chap01_poly.part01_basic.mode.vo;

public class Child1 extends Parent {

	private int n;

	public Child1() {
	
	}
	
	public Child1(int x, int y, int n) {
	super(x,y);
	this.n = n;
	
	}
	
	public void printChild1() {
		System.out.println("자식1");
	}

	@Override
	public void print() {
		System.out.println("자식 클래스 1의 오버라이딩 메서드");
	}

}
