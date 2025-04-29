package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		
		/*c.setX(x);
		c.setY(y);
		c.setRadius(radius);*/
		
		double result = Math.PI * radius * radius;
		
		return //"면적 : "+x+", "+y+", "+radius+" / "+(double)(Math.PI * radius * radius);
		"면적 : " + c + " / " + result;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double result = Math.PI * radius * 2;
		
		//return "둘레 : "+x+", "+y+", "+radius+" / "+result;
		return "둘레 : " + c.toString()/*또는 그냥 c만 가능*/ +" / "+result;
	}
	
	
}

