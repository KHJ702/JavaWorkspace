package com.kh.game.job.model.vo;

import com.kh.game.monster.model.vo.Monster;

public class Wizard extends Characters{

	

	public Wizard() {
		super();
	}

	public Wizard(String name, int level, int atk, int hp, int maxHp, int exp) {
		super(name, level, atk, hp, maxHp, exp);
	}

	@Override
	public void attak(Monster m) {
		
	}

	@Override
	public void useSkill(Monster m) {
		
	}

	@Override
	public void levelup() {
		
	}
	
	@Override
	public String toString() {
		return "Wizard [toString()=" + super.toString() + "]";
	}
}
