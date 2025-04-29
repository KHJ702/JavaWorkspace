package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "면적 : "+x+","+y+" "+height+" "+width+" / "+(height + width);
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "둘레 : "+x+","+y+" "+height+" "+width+" / "+(2*(width+height));
		//return super.toString() + ", " + radius; <-이런식으로 toString 써서 다 바꾸기(오버라이드)

				
	}
	
}
