/**
 * 
 */
package artgame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This is the start of the Class for the Game.
 * @author Group 12
 *
 */
public class MainGame {
	public static ArrayList<Element> elements = Element.elementCreation();
	public static ArrayList<Board> boards = Board.makeBoard();
	public static ArrayList<Systems> systems = Systems.createSystems();
	public static ArrayList<Players> players = Players.playerCreation();

	/**
	 * This is the start of the main method for the Game application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Menu.showStartCredits();

		setUpGame(players, boards, systems, elements);
		playGame(players, boards, elements, systems);

	}// End of main game method

	/**
	 * This method initiates the set up of the Game, either by starting a new game or loading a previous game.
	 * @param players
	 * @param boards
	 * @param systems
	 * @param elements
	 */
	public static void setUpGame(ArrayList<Players> players, ArrayList<Board> boards, ArrayList<Systems> systems,
			ArrayList<Element> elements) {
		// start of method
		Menu.diplayStartMenu();
		

		int startOption = 0;
		boolean ok3 = false;

		// do while loop for making sure their choice is within the correct range (in
		// this case 1 and 2)

		do {
			// do while loop for holding the try catch, to avoid issues with users entering
			// something other than valid integers and breaking the program
			do {
				try {
					// int entered by the possible buyer used to check if they wish to buy or not
					System.out.println("To start the Game, please enter either Option 1 or 2.");
					startOption = Integer.parseInt(PlayerInput.input());
					ok3 = true;
				} catch (Exception ex) {
					System.out.println("Houston we have a problem! - Invalid choice, please try again.");
					ok3 = false;

				}
			} while (!ok3);
			// if the value is not 1 or 2 then they are informed and asked to try again
			if (startOption > 2 || startOption < 1) {
				System.out.println("Houston we have a problem! - Invalid choice, please try again.");
			}
		} while (startOption > 2 || startOption < 1);

		if (startOption == 1) {
			Players.setUpPlayerNames(players, boards, systems);

		} else {
			loadPreviousGame(players, boards, systems, elements);
		}
	}// End of set up game method

	/**
	 * This method loads a previously saved game.  
	 * @param players
	 * @param boards
	 * @param systems
	 * @param elements
	 */
	public static void loadPreviousGame(ArrayList<Players> players, ArrayList<Board> boards, ArrayList<Systems> systems,
			ArrayList<Element> elements) {

		File file = new File("ArtemisGamePrevious.csv");

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = null;
			String[] parsedLine = null;
			line = br.readLine();
			if (line == null) {
				System.out.println("File not Found - There are no saved files to load! \nYou are now being redirected to start a new game...");
				Players.setUpPlayerNames(players, boards, systems);
			} else {
				parsedLine = line.split(",");
				boards.get(0).setPlayerTurn(Integer.parseInt(parsedLine[0]));
				boards.get(0).setNumberOfPlayers(Integer.parseInt(parsedLine[1]));
				for (int loop = 0; loop < players.size(); loop++) {
					line = br.readLine();
					parsedLine = line.split(",");
					players.get(loop).setPlayerName(parsedLine[0]);
					players.get(loop).setPlayerBalance(Integer.parseInt(parsedLine[1]));
					players.get(loop).setPlayerLocation(Integer.parseInt(parsedLine[2]));
				}
				for (int loop = 0; loop < elements.size(); loop++) {
					line = br.readLine();
					parsedLine = line.split(",");
					elements.get(loop).setElementSaleable(Boolean.parseBoolean(parsedLine[0]));
					elements.get(loop).setOwnerNumber(Integer.parseInt(parsedLine[1]));
					elements.get(loop).setElementDevLevel(Integer.parseInt(parsedLine[2]));
					elements.get(loop).setElementDevComplete(Boolean.parseBoolean(parsedLine[3]));
					elements.get(loop).setElementRent(Integer.parseInt(parsedLine[4]));
					elements.get(loop).setDevelopmentCost(Integer.parseInt(parsedLine[5]));
				}

				for (int loop = 0; loop < systems.size(); loop++) {
					line = br.readLine();
					parsedLine = line.split(",");
					systems.get(loop).setFullyBought(Boolean.parseBoolean(parsedLine[0]));
					systems.get(loop).setFullyDeveloped(Boolean.parseBoolean(parsedLine[1]));
					systems.get(loop).setNumberDeveloped(Integer.parseInt(parsedLine[2]));
					systems.get(loop).setOwnerNumber(Integer.parseInt(parsedLine[3]));
				}
				br.close();
				fr.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error, file not found.  Please check file location and try again.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error reading file.  Please check file and try again.");
			e.printStackTrace();
		}

	}// End of load previous game method

	/**
	 * This method saves a current game.
	 * @param players
	 * @param boards
	 * @param systems
	 * @param elements
	 */
	public static void writeToFile(ArrayList<Players> players, ArrayList<Board> boards, ArrayList<Systems> systems,
			ArrayList<Element> elements) {
		
		File file = new File("ArtemisGamePrevious.csv");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("error finding file");
				e.printStackTrace();
			}
		}

		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(boards.get(0).getPlayerTurn() + "," + boards.get(0).getNumberOfPlayers() + "\n");
			for (Players play : players) {
				bw.write(play.getPlayerName() + "," + play.getPlayerBalance() + "," + play.getPlayerLocation() + "\n");
			}
			for (Element elm : elements) {
				bw.write(elm.isElementSaleable() + "," + elm.getOwnerNumber() + "," + elm.getElementDevLevel() + ","
						+ elm.isElementDevComplete() + "," + elm.getElementRent() + "," + elm.getDevelopmentCost()
						+ "\n");
			}

			for (Systems sys : systems) {
				bw.write(sys.isFullyBought() + "," + sys.isFullyDeveloped() + "," + sys.getNumberDeveloped() + ","
						+ sys.getOwnerNumber() + "\n");
			}

			bw.close();
			fw.close();

		} catch (IOException e) {
			System.out.println("Error writing to file - the game has not been saved");
			e.printStackTrace();
		}
	} // end of write to file method

	/**
	 * This is the play game method for the application.
	 * @param players
	 * @param boards
	 * @param elements
	 * @param systems
	 */
	public static void playGame(ArrayList<Players> players, ArrayList<Board> boards, ArrayList<Element> elements,
			ArrayList<Systems> systems) {
		int playerChoice = 0;
		int playerChoice2 = 0;
		int inTurn = 1;
		boolean inputCheck1 = false;
		boolean inputCheck2 = false;
		boolean inputCheck3 = false;
		int fullyDone = 0;

		do {
			do {
				try {
					System.out.println("\n\n'"+players.get(inTurn - 1).getPlayerName()+ "' it is your turn now!");
					System.out.println("\nPlease press 1 to roll the dice and continue on your space odyssey.");
					playerChoice = Integer.parseInt(PlayerInput.input());
					inputCheck1 = true;
				} catch (NumberFormatException nfe) {
					System.out.println("Houston we have a problem! - Please press 1 to rolldice and continue on your space odyssey");
					inputCheck1 = false;
				}
			} while (!inputCheck1);

			if (playerChoice == 1) {
				Board.movePlayer(players, boards, elements, inTurn);
				do {
					if (players.get(inTurn - 1).getPlayerBalance() == 0) {
						System.out.println("'"+players.get(inTurn - 1).getPlayerName()+ "', unfortunately you have run out of dogecoin, therefore it's game over!");
						playerChoice = 6;
						break;
					}
					Menu.displayGameMenu();
					do {
						try {
							System.out.println("Please choose an option and enter the number.");
							playerChoice = Integer.parseInt(PlayerInput.input());
							inputCheck2 = true;
						} catch (NumberFormatException nfe) {
							System.out.println("Houston we have a problem! - Invalid input, please try again.");
							inputCheck2 = false;
						}
					} while (!inputCheck2);
					if (playerChoice == 6) {
						System.out.println("Are you sure you would like to quit? \nPress 1 (Yes) or 2 (No)");
						do {
							do {
								try {
									System.out.println("Please enter your choice.");
									playerChoice2 = Integer.parseInt(PlayerInput.input());
									inputCheck3 = true;
								} catch (NumberFormatException nfe) {
									System.out.println("Houston we have a problem! - Invalid input, please try again.");
									inputCheck3 = false;
								}
							} while (!inputCheck3);
						} while (playerChoice2 >2||playerChoice2<1);
						if (playerChoice2 == 1) {
							System.out.println("You have chosen to quit the Game.  You Space Odyssey is now over!");
							break;
						} else if (playerChoice2 == 2) {
							System.out.println("You have chosen to continue your Space Odyssey!");
							playerChoice = 0;
						}
					} else {
						switch (playerChoice) {
						case 1:
							// method to buy the element player is currently on
							Element.buyElement(elements, players, inTurn, boards, systems);
							break;
						case 2:
							// method to check if all elements in a system have the same owner and
							// set the systems to fully bought for element development
							Systems.checkFullyBought(elements, players, inTurn, boards, systems);
							// element to go through with development of elements
							Element.developElement(elements, players, inTurn, boards, systems);
							break;
						case 3:
							// method for player to sell element they currently own
							Element.sellElement(elements, players, inTurn, boards, systems);
							break;
						case 4:
							// method that displays status of all players, elements and systems
							displayGroupStatus();
							break;
						case 5:
							// group status displayed at end of each turn
							displayGroupStatus();
							// sets number of developments per turn back to 0 for current player
							players.get(inTurn - 1).setNumberDevelopments(0);
							break;
						default:
							System.out.println("Houston we have a problem! - Invalid Option, please enter an Option between 1 and 6");
						}
					}
					fullyDone = 0;
					for (Systems s : systems) {
						if (s.isFullyDeveloped() == true) {
							fullyDone++;
						}
					}
					if (fullyDone == 4) {
						System.out.println("\nCongratulations, all your Systems are now fully developed!");
						boards.get(0).setGameWon(true);
						break;
					}
					if (playerChoice == 5) {
						System.out.println("\nYou have " + fullyDone + " systems fully developed.");
					}
				} while (playerChoice != 5 && fullyDone != 4);
				inTurn++;
				if (inTurn > boards.get(0).getNumberOfPlayers()) {
					inTurn = 1;
				}
				boards.get(0).setPlayerTurn(inTurn);
				writeToFile(players, boards, systems, elements);
				if (playerChoice == 6 || fullyDone == 4) {
					break;
				}
			}
		} while (playerChoice != 6 || fullyDone != 4);
		endGame(players, boards, elements, systems);
	}// End of play game method


	/**
	 * This method displays the Game status to screen
	 * Included are the player status, the element status, and the system status
	 */
	public static void displayGroupStatus() {
		System.out.println("\t\tPlayers Status");
		System.out.println("\t\t--------------");
		System.out.println("--------------------------------------------------");
		System.out.printf("%-15s | %-8s | %-9s | %-7s  %-15s", "Player Name", "Balance", "Position", "Agency", "|");
		System.out.print("\n--------------------------------------------------");
		for (Players p : players) {
			if (!p.getPlayerName().equalsIgnoreCase("void")) {
				System.out.printf("\n%-15s | %-8d | %-9d | %-7s  %-15s", p.getPlayerName(), p.getPlayerBalance(),
						p.getPlayerLocation(), p.getAgency(),"|");
			}
		}
		System.out.println("\n--------------------------------------------------");
		
		System.out.println("\n\t\tElements Status");
		System.out.println("\t\t---------------");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-25s | %-40s | %-15s | %-26s | %-29s  %-29s", "System", "Element Name", "Owner","Element Development Level", "Element Development Complete", "|");
		System.out.print("\n-----------------------------------------------------------------------------------------------------------------------------------------------------");
		for (Element e : elements) {
			if (e.getElementNumber() != 1 && e.getElementNumber() != 7) {
				if (e.getOwnerNumber() == 0) {
					System.out.printf("\n%-25s | %-40s | %-15s | %-26d | %-29b  %-29s", systems.get(e.getSystemNumber()).getSystemName(), e.getElementName(), "No Owner", e.getElementDevLevel(), e.isElementDevComplete(), "|");
				} else {
					System.out.printf("\n%-25s | %-40s | %-15s | %-26d | %-29b  %-29s", systems.get(e.getSystemNumber()).getSystemName(), e.getElementName(), players.get(e.getOwnerNumber() - 1).getPlayerName(),
							e.getElementDevLevel(), e.isElementDevComplete(),"|");
				}

			}
			
		}
		System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\n\t\tSystems Status");
		System.out.println("\t\t---------------");
		System.out.print("------------------------------------------------------------------------------------------------------------");
		System.out.printf("\n%-20s | %-13s | %-36s | %-28s  %-30s", "System Name", "System Owner",
				"Number Elements Developed In System", "System Development Complete", "|");
		System.out.print("\n------------------------------------------------------------------------------------------------------------");
		for (Systems s : systems) {
			if (s.getSystemNumber() != 0) {
				if (s.getOwnerNumber() == 0) {
					System.out.printf("\n%-20s | %-13s | %-36s | %-28b  %-30s", s.getSystemName(),
							"No Owner", s.getNumberDeveloped(), s.isFullyDeveloped(), "|");
				} else {
					System.out.printf("\n%-20s | %-13s | %-36s | %-28b  %-30s", s.getSystemName(),
							players.get(s.getOwnerNumber() - 1).getPlayerName(), s.getNumberDeveloped(),
							s.isFullyDeveloped(), "|");
				}
			}
		}
		System.out.print("\n------------------------------------------------------------------------------------------------------------");
	} // end of display group status method

	// method for the end of the game, depending if the players have achieved the
	// ultimate goal of the game or if they've hit 6 to quit beforehand
	
	
	/**
	 * This is the end game method.
	 * It will take account of the game finishing through winning, the game finishing through a player losing, and the game finishing by player choice.
	 * @param players
	 * @param boards
	 * @param elements
	 * @param systems
	 */
	public static void endGame(ArrayList<Players> players, ArrayList<Board> boards, ArrayList<Element> elements,
			ArrayList<Systems> systems) {
		if (boards.get(0).isGameWon()) {
			System.out.println("\nCongratulations, you have won!");
			Menu.showWinningCredits(elements, players, boards, systems);
		} else {
			boolean loss = false;
			for (Players p : players) {
				if (p.getPlayerBalance() == 0) {
					System.out.println(
							"You must work together next time to win, making sure everyone's balance stays above 0!");
					Menu.showLosingCreditsBalance();
					loss = true;
				}
			}
			if (!loss) {
				Menu.showLosingCreditsQuit();
				System.out.println(
						"If you wish, you may choose to resume your game by selecting the load game when the game is restarted!");
			}
		}
	} // End of end game method
}
