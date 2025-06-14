package com.kh.game.controller;

import com.kh.game.job.model.vo.Archer;
import com.kh.game.job.model.vo.Characters;
import com.kh.game.job.model.vo.Warrior;
import com.kh.game.job.model.vo.Wizard;
import com.kh.game.monster.model.vo.Dragon;
import com.kh.game.monster.model.vo.Goblin;
import com.kh.game.monster.model.vo.Monster;
import com.kh.game.monster.model.vo.Orc;

public class GameController {

	private Characters character;
	
	public Characters createCharacter(int job, String name) {
		switch(job) {
		case 1:
			character = new Warrior(name, 1, 2 , 10 ,10, 0);
			break;
		case 2:
			character = new Archer(name, 1, 3 , 5 ,10, 0);
			break;
		case 3:
			character = new Wizard(name, 1, 500 , 500 ,500, 0);
			break;
		}
		
		return character;		
	}

	public Characters getCharacter() {
		return character;
	}
	
	public Monster createMonster(int num) {
		switch(num) {
		case 1:
			return new Goblin("고블린", 1, 3, 100);
		case 2:
			return new Orc("오크", 10,100,200);
		case 3:
			return new Dragon("드래곤",2000,2000,300);
		}
		return null;
	}

}