package com.kh.game.job.model.vo;

import com.kh.game.monster.model.vo.Monster;

public class Warrior extends Characters{
	
	
	public Warrior() {
		super();
	}

	public Warrior(String name, int level, int atk, int hp, int maxHp, int exp) {
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
		return "Warrior [toString()=" + super.toString() + "]";
	}


}
