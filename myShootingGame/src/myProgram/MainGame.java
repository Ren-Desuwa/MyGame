package myProgram;

import java.util.*;

public class MainGame {
	
	static Random random = new Random();
	static Scanner scan = new Scanner(System.in);
	static String input = null,Ranimal = null;
	static int inputInt = 0,chanceAcc = 0,chancePre = 0, accuracy = 30, precision = 20,Rand = 0, Gold = 0;
	static boolean GameEnd = false,userInput = false,menu = false,Hunted = false;
	static String[] 
			home = {
					"Enter 1 to Hunt",
					"Enter 9 to Endgame"
				},
			hunt = {
					"Enter 1 to Aim",
					"Enter 2 to Shoot",
					"Enter 9 to Run away"
				};
	
	public static void main(String[] args) {
		System.out.println("shooting game");
		System.out.println("Enter 1 to Start the game \nEnter 9 to End the game");
		
		do {
			input = scan.nextLine();
			try {
				inputInt = Integer.parseInt(input);
			}
			catch (NumberFormatException e) {
				System.out.println("Invalid input");
				System.out.println("Please Enter 1 to Start the game \nEnter 9 to End the game");
				userInput = false;
			}
			if (inputInt == 9) {
				userInput = true;
				GameEnd = true;
			} else if (inputInt != 1) {
				userInput = false;
				System.out.println("Invalid input");
				System.out.println("Please Enter 1 to Start the game \nEnter 9 to End the game");
			} else {
				userInput = true;
			}
		} while(!userInput);
		
		System.out.println("Game Started!");
		while (!GameEnd) {
			
				
			Game();
			
			
		}
		System.out.println("Game Ended");
	}

	public static void Game() {
		System.out.println("you have : "+ Gold + " Gold");
		System.out.println("\nWhat would you like to do?");
		for (int i = 0;i <= 1 ; i++) {
			System.out.println(home[i]);
		}
		input();		
		switch (inputInt) {
			case 1:
				hunt();
				break;
			case 9:
				GameEnd = true;
				break;
			default:
				System.out.println("Invalid input");
		}
		
		
	}


	

	public static void input() {
		menu = false;
		do {
			try {
				input = scan.nextLine();
				inputInt = Integer.parseInt(input);
				menu = true;
			}
			catch (NumberFormatException e) {
				System.out.println("Invalid input please try again");
				menu = false;
			}
		} while (!menu);
	}

	public static void hunt() {
		Hunted = false;
		Rand = random.nextInt(4) + 1;
		switch (Rand) {
		case 1: 
			Ranimal = "Deer";
			break;
		case 2: 
			Ranimal = "Cow";
			break;
		case 3: 
			Ranimal = "Pig";
			break;
		case 4: 
			Ranimal = "Goat";
			break;
		}
		System.out.println("you try to hunt in the woods");
		System.out.println("you spot a "+ Ranimal + " nearby");
		
		do {
			System.out.println("what would you like to do?");
			for (int i = 0;i <= 2 ; i++) {
				System.out.println(hunt[i]);
			}
			
			input();		
			switch (inputInt) {
				case 1:
					int runaway = random.nextInt(5) + 1;
					switch (runaway) {
						case 5:
							System.out.println("You took too long and the "+ Ranimal +" got away");
							Hunted = true;
							break;
						default:
							accuracy += 5;
							chancePre++ ;
							System.out.println("You Aimed succesfully!");
							System.out.println("carefull not to let the "+ Ranimal +" get away");
							Hunted = false;
					}
					break;
				case 2:
					chancePre += precision / 2;
					if (accuracy >= random.nextInt(100) - chancePre) {
						System.out.println("You shot it!!");
						int sold = Rand * 35; 
						System.out.println("You gain "+ sold +" Gold!");
						Gold += sold;
						Hunted = true;
					}
					else {
						System.out.println("You missed and the "+ Ranimal +" got away");
						Hunted = true;
					}
					break;
				case 9:
					Hunted = true;
					System.out.println("You Ran away from the "+ Ranimal);
					break;
			}
		} while(!Hunted);
	}
}
		






























































