package com.kh.game.monster.model.vo;

import com.kh.game.job.model.vo.Characters;

public class Dragon extends Monster {

	private int count;
	
	@Override
	public void attack(Characters C) {
		
	}

	public void breath(Characters C) {
		
	}
	
	public Dragon() {
		super();
	}

	public Dragon(String name, int atk, int hp, int exp) {
		super(name, atk, hp, exp);
	}
	

}
