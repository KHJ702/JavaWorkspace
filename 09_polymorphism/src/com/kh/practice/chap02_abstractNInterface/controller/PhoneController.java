package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class PhoneController {
	
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] arr = new Phone[2];
		arr[0] = new GalaxyNote9();
		arr[1] = new V40();
		
		result[0] = ((GalaxyNote9)arr[0]).printInformation();
		result[1] = ((V40)arr[1]).printInformation();
		
		return result;
		
	}
	
}


