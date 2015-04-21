/*
**	file:		Battle.java
**	purpose:	Contains all functions pertaining to the battle sequence of the game.
*/

public class Battle {
	Fighter player;
	FIghter enemy;
	//counts the number of rounds the fight has taken so far.
	int round = 1;

	//Basic flow of the battle sequence. Speed is check each round in case changes are made mid
	//battle by items or abilities
	public BattleSequence {
		while(Player.hp > 0 || Enemy.hp > 0) {
			//Check speed to determine who goes first.
			if(Player.speed > Enemy.speed) {
				playerTurn();
				enemyTurn();
			} else {
				enemyTurn();
				playerTurn();
			}
		}
		//Determine which combatant is defeated and award experience if necessary
		if(Player.hp <= 0) {
			System.out.println("You have been defeated");
			gameover();
		} else {
			System.out.println("Victory is yours!")
			player.addEXP(enemy.getEXP);
		}
	}

	public playerTurn() {

		System.out.println("You steel yourself for battle. What will you do?\n"); //random line in future release
		System.out.println("1. Attack!\n2. Items\n3. Ability");	//replace with button interface
		
		int choice;
		case(choice) {

			case 1:	attack(player, monster);
					break();

			case 2: item();
					break();

			case 3: ability();
					break();
		
		}
	}

	public enemyTurn() {
		attack(Enemy, Player);
	}

	public attack(Fighter attacker, Fighter defender) {
		double damage = attacker.atk - defender.def;
		defender.setHP(defender.getHP() - damage);
	}
}
