package swiggy_pro.assesment;

import java.util.Random;

// Class representing a player in the game
class Player {
	int health;
	int strength;
	int attack;
	Random randomNum;
	
	// Constructor to initialize a player with health, strength, and attack values
	public Player(int health, int strength, int attack) {
		this.health = health;
		this.strength = strength;
		this.attack = attack;
		this.randomNum = new Random();
	}
	
	// Function to get the current health of the player
	int getHealth() {
		return health;
	}

	// Function to simulate an attack roll with a 6-sided die
	int attack() {
		int rand = randomNum.nextInt(6) + 1; // it gives the number from 0 to 5 so that add 1 to get numbers from 1 to 6
		return rand;
	}

	// Function to simulate an defense roll with a 6-sided die
	int defend() {
		int rand = randomNum.nextInt(6) + 1; // it gives the number from 0 to 5 so that add 1 to get numbers from 1 to 6
		return rand;
	}

	// Function to reduce the health of the player by a given damage amount
	void reduceHealth(int damage) {
		health = health - damage;		
	}

	// Function to check if the player is still alive
	boolean isAlive() { 
		return health > 0;
	}
}


// Class representing the magical arena where two players fight
class MagicalArena {
	Player player_A;
	Player player_B;

	
	// Constructor to initialize the arena with two players
	public MagicalArena(Player playerA, Player playerB) {
		this.player_A = playerA;
		this.player_B = playerB;
	}

	// Function to simulate the fight between the two players
	void fight() {
		Player attacker = player_A.health < player_B.health ? player_A : player_B;
		Player defender = attacker == player_A ? player_B : player_A;

		while (player_A.isAlive() && player_B.isAlive()) {
			int attackRoll = attacker.attack();
			int defenseRoll = defender.defend();

			int damage = attackRoll * attacker.attack - defenseRoll * defender.strength;
			if (damage > 0) {
				defender.reduceHealth(damage);
			}

			// Swap roles for the next round
			Player temp = attacker;
			attacker = defender;
			defender = temp;
		}

		if (player_A.isAlive()) {
			System.out.println("Player A wins!");
		} else {
			System.out.println("Player B wins!");
		}
	}
}

public class App {
	
	public static void main(String[] args) {
		
		// Create two players with specified health, strength, and attack values
		Player playerA = new Player(50, 5, 10);   // creating objects
		Player playerB = new Player(100, 10, 5);

		// Create a magical arena with the two players and start the fight
		MagicalArena arena = new MagicalArena(playerA, playerB);
		arena.fight();
	}

}
