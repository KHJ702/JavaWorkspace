package com.kh.game.monster.model.vo;

import com.kh.game.job.model.vo.Characters;

public class Orc extends Monster{
	
	private int count;

	@Override
	public void attack(Characters C) {
		
	}

	public void heal() {
		
	}

	public Orc() {
		super();
	}

	public Orc(String name, int atk, int hp, int exp) {
		super(name, atk, hp, exp);
	}

	
}
