package com.kh.chap02_abstract.part02.model.vo;

public class Baby extends Person implements Basic{

	public Baby() {
		super();
	}

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}



	@Override
	public void eat() {
		setWeight(getWeight() + 3); // <<- 내 몸무게 겟(가져옴)해서 3 더하고 셋(저장)함
		setHealth(getHealth() + 1);
	}


	@Override
	public void sleep() {
		setHealth(getHealth() + 3);
	}






}