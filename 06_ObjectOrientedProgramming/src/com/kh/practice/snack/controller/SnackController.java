package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;
import com.kh.practice.snack.view.SnackMenu;

public class SnackController {

	private Snack s = new Snack();
	
	public SnackController() { 
		
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		//s = new Snack(kind, name, flavor, numOf, price); (setter 만들었으면 이렇게 말고 위에껄로 해야함)
		
		return "저장 완료되었습니다.";
}
	
	public String confirmData() {
		
		//return s.getKind()+"("+s.getName()+"-"+s.getFlavor()+")"+s.getNumOf()+"개"+s.getPrice()+"원";
		//가독성이 안좋기 때문에 information으로 넘김
		return s.information();
		
		}
	}




