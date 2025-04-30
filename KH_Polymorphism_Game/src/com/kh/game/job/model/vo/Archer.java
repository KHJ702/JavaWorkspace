package com.kh.game.job.model.vo;

import com.kh.game.monster.model.vo.Monster;

public class Archer extends Characters{
	
	public Archer() {
		super();
	}

	public Archer(String name, int level, int atk, int hp, int maxHp, int exp) {
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
		return "Archer [toString()=" + super.toString() + "]";
	}

}
