package com.kh.practice.point.model.vo;

public class Circle extends Point {

	private int radius;
	
	public Circle() {
		super();
	}
	
	public Circle(int x, int y, int radius) {
		super.getX();
		super.getY();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + radius;
	}
	
	
}
