/**
 * 
 */
package artgame;

import java.util.ArrayList;

/**
 * This is the Board Class
 * 
 * @author Group 12
 *
 */
public class Board {
	private boolean gameWon;
	private int playerTurn;
	private int numberOfPlayers;
	public static final int PASS_GO = 100;
	public static final int MAX_ELEMENTS = 12;

	/**
	 * Default constructor
	 */
	public Board() {
	
	}

	/**
	 * This is the constructor with arguments passed in.
	 * 
	 * @param playerTurn
	 * @param numberOfPlayers
	 * @param gameWon
	 */
	public Board(int playerTurn, int numberOfPlayers, boolean gameWon) {
		this.setPlayerTurn(playerTurn);
		this.numberOfPlayers = numberOfPlayers;
		this.gameWon = gameWon;
	}

	/**
	 * This gets the Player in turn.
	 * 
	 * @return the playerTurn
	 */
	public int getPlayerTurn() {
		return playerTurn;
	}

	/**
	 * This sets the Player in turn.
	 * 
	 * @param playerTrun the playerTurn to set
	 */
	public void setPlayerTurn(int playerTurn) {
		this.playerTurn = playerTurn;
	}

	/**
	 * This gets the number of players taking part in the Game. The number will be
	 * between 2-4
	 * 
	 * @return the numberOfPlayers
	 */
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	/**
	 * This sets the number of players taking part in the Game. The number will be
	 * set between 2-4
	 * 
	 * @param numberOfPlayers the numberOfPlayers to set
	 */
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	/**
	 * This gets the Game Won indicator
	 * 
	 * @return
	 */
	public boolean isGameWon() {
		return gameWon;
	}

	/**
	 * This sets the Game Won indicator
	 * 
	 * @param gameWon
	 */
	public void setGameWon(boolean gameWon) {
		this.gameWon = gameWon;
	}

	/**
	 * This method creates an instances of the Board and returns the array list.
	 * 
	 * @return - returns an array list of the Board.
	 */
	public static ArrayList<Board> makeBoard() {
		Board board = new Board(1, 0, false);
		ArrayList<Board> boards = new ArrayList<Board>();
		boards.add(board);
		return boards;
	}

	/**
	 * This method checks the status of an element to determine if any Player owns
	 * the element.
	 * 
	 * @param elements
	 * @param players
	 * @param plTurn
	 * @param checkElement
	 */
	public static void checkElement(ArrayList<Element> elements, ArrayList<Players> players, int plTurn,
			int checkElement) {
		int playerChoice = 0;
		boolean elementCheck1 = false;
		boolean elementCheck2 = false;
		if (elements.get(checkElement - 1).getElementNumber() != 1
				&& elements.get(checkElement - 1).getElementNumber() != 7) {
			if (plTurn == elements.get(checkElement - 1).getOwnerNumber()) {
				System.out.println("You already own this Element.  Please select another choice.\n");
			} else if (elements.get(checkElement - 1).isElementSaleable() == false) {
				System.out.println("\nYou have the opportunity to purchase this Element, as it is not owned by any other Player.\n");
			} else {
				System.out.println("Element " + elements.get(checkElement - 1).getElementNumber() + " - "
						+ elements.get(checkElement - 1).getElementName()
						+ " is already owned by another Player.\n  \nUnfortunately you may be required to pay rent for landing on this Element! \nThe rent is "
						+ elements.get(checkElement - 1).getElementRent()+ " dogecoin.  This amount will be credited to '"
						+ players.get(elements.get(checkElement - 1).getOwnerNumber() - 1).getPlayerName() + "'.\n");
				System.out.println("'"+players.get(elements.get(checkElement - 1).getOwnerNumber() - 1).getPlayerName()
						+ "' do you accept the rent?\n Press: 1 (yes) or 2 (no)");
				do {
					do {
						try {
							playerChoice = Integer.parseInt(PlayerInput.input());
							elementCheck1 = true;
						} catch (NumberFormatException nfe) {
							System.out.println("Houston we have a problem! - Please re-enter your choice.");
							elementCheck1 = false;
						}
					} while (!elementCheck1);
					if (playerChoice == 1) {
						if (players.get(plTurn - 1).getPlayerBalance() < elements.get(checkElement - 1)
								.getElementRent()) {
							System.out.println("'"+players.get(plTurn - 1).getPlayerName()+ "', you cannot afford the full rent amount!");
							players.get(plTurn - 1).setPlayerBalance(players.get(plTurn - 1).getPlayerBalance()
									- players.get(plTurn - 1).getPlayerBalance());
							players.get(elements.get(checkElement - 1).getOwnerNumber() - 1).setPlayerBalance(
									players.get(elements.get(checkElement - 1).getOwnerNumber() - 1).getPlayerBalance()
											+ players.get(plTurn - 1).getPlayerBalance());
							System.out.println("'"+players.get(plTurn - 1).getPlayerName()+ "' your balance is now 0 dogecoin.");
							elementCheck2 = true;
						} else {
							players.get(plTurn - 1).setPlayerBalance(players.get(plTurn - 1).getPlayerBalance()
									- elements.get(checkElement - 1).getElementRent());
							players.get(elements.get(checkElement - 1).getOwnerNumber() - 1).setPlayerBalance(
									players.get(elements.get(checkElement - 1).getOwnerNumber() - 1).getPlayerBalance()
											+ elements.get(checkElement - 1).getElementRent());
							System.out.println("'"+players.get(plTurn - 1).getPlayerName() + "' your account has been debited by "
											+ elements.get(checkElement - 1).getElementRent() + " dogecoin. \n'"
											+ players.get(elements.get(checkElement - 1).getOwnerNumber() - 1).getPlayerName()+ "' your account has been credited with " + elements.get(checkElement - 1).getElementRent() + " dogecoin.\n");
							elementCheck2 = true;
						}
					} else if (playerChoice == 2) {
						System.out.println("Thank you.  Through collaboration we will get to the moon sooner!\n");
						elementCheck2 = true;
					} else {
						System.out.println("Houston we have a problem!  Please enter a valid option.");
						elementCheck2 = false;
					}
				} while (!elementCheck2);
			}
		} else {
			System.out.println("This is a free Element.  It cannot be purchased and there is no rent for landing here.\n");
		}
	}// End of check element method

	/**
	 * This method moves the players location on the virtual Board by getting the
	 * current location, utilising the rollDice() method, setting the new location,
	 * and checking the status of the new location by calling the checkElement()
	 * method.
	 * 
	 * @param players
	 * @param boards
	 * @param elements
	 * @param plTurn
	 */
	public static void movePlayer(ArrayList<Players> players, ArrayList<Board> boards, ArrayList<Element> elements,
			int plTurn) {// start of method
		Dice dice = new Dice();
		/**
		 * Player Turn is stored in the Board Class. A variable 'nextTurn' is created to
		 * get the player in turn, and will also be used to update the player turn THe
		 * loop is for example purposes. Still have to figure out what type of loop will
		 * be required.
		 */

		/**
		 * the game will start with Player 1. As the game plays, the player information
		 * will be obtained based on the nextTurn counter. the players current location
		 * will be defined here.
		 */

		/**
		 * to work out the new location, the rollDice() method is all and added to the
		 * currentLocation
		 */
		players.get(plTurn - 1).setPlayerLocation(players.get(plTurn - 1).getPlayerLocation() + dice.rollDice());
		if (players.get(plTurn - 1).getPlayerLocation() > MAX_ELEMENTS) {
			players.get(plTurn - 1).setPlayerBalance(players.get(plTurn - 1).getPlayerBalance() + PASS_GO);
			System.out.println(
					"You have passed by the Kennedy Space Centre from a project update and have been credited with 100 dogecoin! \nThis means your balance is now "
							+ players.get(plTurn - 1).getPlayerBalance()+" dogecoin.\n");
			players.get(plTurn - 1).setPlayerLocation(players.get(plTurn - 1).getPlayerLocation() - MAX_ELEMENTS);
			;
		}
		/**
		 * the players new location is set. Again this is based on the nextTurn counter.
		 */
		System.out.println("'"+players.get(plTurn - 1).getPlayerName() + "' you have landed on Element "
				+ players.get(plTurn - 1).getPlayerLocation()+" - "+ elements.get(players.get(plTurn-1).getPlayerLocation()-1).getElementName());
		/**
		 * this method checks whether the element landed on is available to purchase. if
		 * it is, you have the option to purchase if it is not, you will have to pay
		 * rent
		 */
		checkElement(elements, players, plTurn, players.get(plTurn - 1).getPlayerLocation());

	}// End of move player method
}
