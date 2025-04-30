package com.kh.chap02_abstract.part02.model.vo;

public class Mother extends Person implements Basic{
	
	public Mother() {
		super();
	}

	public Mother(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public void eat() {
		// 엄마가 밥을 먹으면
		// 몸무게가 10 증가
		setWeight(getWeight() +10); // <<- 내 몸무게 겟(가져옴)해서 10 더하고 셋(저장)함
		// health = health + 10;
		// 위에가 private라 set,get 메서드 이용해야함
		
		// 건강도는 10 감소
		setHealth (getHealth() - 10);
	}
	
	@Override
	public void sleep() {
		// 잠을 자면 건강도가 10 증가
		setHealth (getHealth() + 10);
		
	}
	
}
