package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	
	public static void main(String[] args) {
	
		Animal [] arr = new Animal[5];
		
		arr[0] = new Dog("바비","말티즈",3);
		arr[1] = new Dog("삐보","요크셔테리어",2);
		arr[2] = new Dog("대장","치와와",2);
		arr[3] = new Cat("영희","치즈","스트릿","노랑");
		arr[4] = new Cat("철수","코숏","카페","검정");
		
	 for(int i = 0 ; i <arr.length; i++) {
		 arr[i].speak();
	 }
		
   }
}
