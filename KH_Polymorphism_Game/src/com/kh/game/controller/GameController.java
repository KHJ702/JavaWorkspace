package com.kh.game.controller;

import com.kh.game.job.model.vo.Characters;
import com.kh.game.monster.model.vo.Monster;

public class GameController {

	private Characters character;
	
	public void createCharacter(int job, String name) {
		
	}

	public Characters getCharacter() {
		return character;
		}
	
	public static Monster createMonster(int num) {
		return new Monster();
	}
	
}