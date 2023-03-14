/**
 * 
 */
package artgame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This is the Menu Class
 * @author Group 12
 *
 */
public class Menu {
	
	private String menu;
	
	/**
	 * default constructor
	 */
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with parameter arguments
	 * @param menu
	 */
	public Menu(String menu) {
		this.setMenu(menu);
	}

	/**
	 * This gets the menu
	 * @return the menu
	 */
	public String getMenu() {
		return menu;
	}

	/**
	 * This sets the menu
	 * @param menu the menu to set
	 */
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	/**
	 * This method displays the Start Game Menu to screen
	 */
	public static void diplayStartMenu() {
		
		System.out.println("\tSTART GAME MENU");
		System.out.println("\t---------------");
		System.out.println("\t1. Start New Game");
		System.out.println("\t2. Load Previous Game\n");
	}// end of display start menu
	
	/**
	 * This method displays the Game Menu to screen
	 */
	public static void displayGameMenu() {

		System.out.println("\n\tGAME PLAY MENU");
		System.out.println("\t--------------");
		System.out.println("\t1. Purchase the Element");
		System.out.println("\t2. Develop the Element");
		System.out.println("\t3. Sell the Element");
		System.out.println("\t4. Display Status");
		System.out.println("\t5. End Turn");
		System.out.println("\t6. End Game");
		//System.out.println("Please choose your next action and enter the number");

	}// end of display game menu
	

	/**
	 * This method displays the opening credits for the game
	 * 
	 * ASCII Art from ASCII Art Archive: https://www.asciiart.eu/space
	 */
	public static void showStartCredits() {

		String line;
		File file = new File("src\\StartScript.txt");

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
			while (line != null) {
				System.out.println(line);
				Thread.sleep(10);
				line = br.readLine();
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Could not find file: StartScript.txt");
		} catch (IOException e) {
			System.out.println("Oops");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(500);
			
			System.out.println("\n\tThe aim of the Game is to work collaboratively to achieve\n\t a successful space launch to the Moon, and beyond.\n\n\n");

		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

	}// end of show start credits

	/**
	 * This method displays the winning credits to screen
	 * 
	 * ASCII Art from ASCII Art Archive: https://www.asciiart.eu/space
	 * 
	 * @param elements
	 * @param players
	 * @param inTurn
	 * @param boards
	 * @param systems
	 */
	public static void showWinningCredits(ArrayList<Element> elements, ArrayList<Players> players, ArrayList<Board> boards, ArrayList<Systems> systems) {

		// How to link system owners to access names for within print statements
		try {
			
			System.out.println(
					"\n   2010\n\tApril: President Barack Obama proposes an extra US$6 billion funding for the development of heavy lift rockets, \n\tcompleted by 2015 leading to Mars missions by the mid-2030s\n\tOctober: The President signs the NASA Authorization Act of 2010 into law. Thus begins the immediate development of the Space Launch System \n\tand the continued development of a Crew Exploration Vehicle.\n");

			Thread.sleep(2500);

			System.out.println(
					"   2017\n\tJune: President Donald Trump signs an executive order to re-establish the National Space Council.\n\tThe administrations first budget maintained Obama's funding to continue development of \n\tthe Commercial Resupply Services, Commercial Crew Development, the Space Launch System, and the Orion spacecraft, intended for deep space missions.\n");
			Thread.sleep(2500);
			System.out.println("   2020\n\tJanuary: " + players.get(systems.get(1).getOwnerNumber() - 1).getPlayerName()
					+ ", world leading propulsions specialist in a new role as " + players.get(systems.get(1).getOwnerNumber() - 1).getAgency() +" boss starts working on the Space Launch System.\n\tMay: Required 66.7kN thrust achieved during testing.\n\tAugust: Final liquid oxygen delivery received and tested.\n\tSeptember: Space Launch System development complete!\n");
			Thread.sleep(2500);
			System.out.println("   2021\n\tJanuary: " + players.get(systems.get(2).getOwnerNumber() - 1).getPlayerName()
					+ ", a Physics genius, the current head of " + players.get(systems.get(2).getOwnerNumber() - 1).getAgency() + " starts development of the Orion Spacecraft.\n\tApril: Titanium truss skeleton structure complete.\n\tJune: All 11 required parachutes pass testing in case of LAS failure. Final Ascent Abort-2 tests passed.\n\tDecember: Development of the Orion Spacecraft finalised!\n");
			Thread.sleep(2500);
			System.out.println("   2022\n\tJanuary: Dogecoin is worth $30,000 a piece. Elon Musk buys "
					+ players.get(systems.get(3).getOwnerNumber()-1).getAgency()
					+ ".  February: "+ players.get(systems.get(3).getOwnerNumber() - 1).getAgency() +", Elon Musk's cousin, CEO of "+players.get(systems.get(3).getOwnerNumber()-1).getAgency()+ " takes on the Gateway project.\n\tMarch: Newly developed neoprene interior allows exploration at -85 degrees Celcius.\n\tNovember: The Gateway has been fully developed!\n");
			Thread.sleep(2500);
			System.out.println("   2023\n\tJanuary: " + players.get(systems.get(4).getOwnerNumber() - 1).getPlayerName()
					+ ", a third cousin of Albert Einstein, new boss at "+ players.get(systems.get(4).getOwnerNumber() - 1).getAgency() + " starts development on Artemis Base Camp.\n\tMarch: Tesla tyres pass the moon test. Dogecoin worth $500,000.\n\tJuly: Extra government funding secured required to complete build.\n\tOctober: The Artemis Base Camp completely developed!\n");
			Thread.sleep(500);
			System.out.println("\nFinal game status...\n");
			MainGame.displayGroupStatus();
	
			Thread.sleep(3000);
			System.out.println("   2024\n\tAll system development complete. Artemis systems ready to launch.\n");
		Thread.sleep(500);
			System.out.println(" /\\/\\/\\                            /  \\\r\n"
					+ "| \\  / |                         /      \\\r\n"
					+ "|  \\/  |                       /          \\\r\n"
					+ "|  /\\  |----------------------|     /\\     |\r\n"
					+ "| /  \\ |                      |    /  \\    |\r\n"
					+ "|/    \\|                      |   /    \\   |\r\n"
					+ "|\\    /|                      |  | (  ) |  |\r\n"
					+ "| \\  / |                      |  | (  ) |  |\r\n"
					+ "|  \\/  |                 /\\   |  |      |  |   /\\\r\n"
					+ "|  /\\  |                /  \\  |  |      |  |  /  \\\r\n"
					+ "| /  \\ |               |----| |  |      |  | |----|\r\n"
					+ "|/    \\|---------------|    | | /|   .  |\\ | |    |\r\n"
					+ "|\\    /|               |    | /  |   .  |  \\ |    |\r\n"
					+ "| \\  / |               |    /    |   .  |    \\    |\r\n"
					+ "|  \\/  |               |  /      |   .  |      \\  |\r\n"
					+ "|  /\\  |---------------|/        |   .  |        \\|\r\n"
					+ "| /  \\ |               / Artemis |   .  |  Lite   \\\r\n"
					+ "|/    \\|              (          |      |           )\r\n"
					+ "|/\\/\\/\\|               |    | |--|      |--| |    |\r\n"
					+ "------------------------/  \\-----/  \\/  \\-----/  \\--------_            \r\n"
					+ "                        \\\\//     \\\\//\\\\//     \\\\//		   -\r\n"
					+ "                         \\/       \\/  \\/       \\/");

			Thread.sleep(500);
			System.out.println("T-10");
			Thread.sleep(1000);

			for (int loop = 9; loop > 0; loop--) {
				System.out.println(loop + "...");
				Thread.sleep(1000);
			}
			System.out.println("1... Artemis to the moon!");

			// Animated Rocket Launch
			String line;
			File file = new File("src\\WinningScript.txt");

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
			while (line != null) {
				System.out.println(line);
				Thread.sleep(50);
				line = br.readLine();
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Could not find file: WinningScript.txt");
		} catch (IOException e) {
			System.out.println("Oops");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}// end of show winning credits method

	/**
	 * This method displays the losing credits to screen
	 * 
	 * ASCII Art from ASCII Art Archive: https://www.asciiart.eu/space
	 */
	public static void showLosingCreditsBalance() {

		try {
			Thread.sleep(1000);

			System.out.println("Unfortunately, your balance has reached zero and you have lost the game...");
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		String line;
		File file = new File("src\\LosingScriptBalance.txt");

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
			while (line != null) {
				System.out.println(line);
				Thread.sleep(50);
				line = br.readLine();
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Could not find file: LosingScriptBalance.txt");
		} catch (IOException e) {
			System.out.println("Oops");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	} // end of show losing credits method

	/**
	 * This method displays the losing credits to screen when a player quits the game
	 * 
	 * ASCII Art from ASCII Art Archive: https://www.asciiart.eu/space
	 */
	public static void showLosingCreditsQuit() {

		try {
			Thread.sleep(1000);

			System.out.println("Are you not entertained?..");
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		String line;
		File file = new File("src\\LosingScriptQuit.txt");

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
			while (line != null) {
				System.out.println(line);
				Thread.sleep(50);
				line = br.readLine();
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Could not find file: LosingScriptQuit.txt");
		} catch (IOException e) {
			System.out.println("Oops");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}// end of show losing credits quit by player method
}



