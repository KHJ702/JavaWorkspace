package com.kh.practice.point.model.vo;

// set 값을 저장(셋팅)하게 유도하는 메서드 (set = 지정하는것)
// get 값을 return 받게 해주는 메서드  (get = 가져오는것)
public class Point {

	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.getX();
		this.getY();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return x + ", " +y ;
	}
	
}
