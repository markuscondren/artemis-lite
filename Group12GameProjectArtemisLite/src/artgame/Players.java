/**
 * 
 */
package artgame;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Players Class which inherits from the Player Class
 * @author Group 12
 *
 */
public class Players extends Player {

	private int playerNumber;
	private int playerLocation;
	private AgencyName agencyName;
	private int numberDevelopments;
	public static final int MIN_PLAYER_NUMBER = 2;
	public static final int MAX_PLAYER_NUMBER = 4;
	public static final int INITIAL_BALANCE = 1000;

	/**
	 * default constructor
	 */
	public Players() {

	}
	
	/**
	 * Constructor with parameter arguments
	 * @param playerName
	 * @param playerBalance
	 */
	public Players(String playerName, int playerBalance, int playerNumber, int playerLocation, AgencyName agencyName,
			int numberDevelopments) {
		super(playerName, playerBalance);
		this.playerNumber = playerNumber;
		this.playerLocation = playerLocation;
		this.agencyName = agencyName;
		this.numberDevelopments = numberDevelopments;
	}

	/**
	 * This method creates an Array List of Players and adds the Players to the list.
	 * @return - returns the array list of players
	 */
	public static ArrayList<Players> playerCreation() {
		Players Player1 = new Players("void", INITIAL_BALANCE, 1, 1, AgencyName.NASA, 0);
		Players Player2 = new Players("void", INITIAL_BALANCE, 2, 1, AgencyName.CSA, 0);
		Players Player3 = new Players("void", INITIAL_BALANCE, 3, 1, AgencyName.JAXA, 0);
		Players Player4 = new Players("void", INITIAL_BALANCE, 4, 1, AgencyName.ESA, 0);

		ArrayList<Players> players = new ArrayList<Players>();
		players.add(Player1);
		players.add(Player2);
		players.add(Player3);
		players.add(Player4);
		return players;
	}

	/**
	 * This gets the Player Number
	 * @return the playerNumber
	 */
	public int getPlayerNumber() {
		return playerNumber;
	}

	/**
	 * This sets the Player Number
	 * @param playerNumber the playerNumber to set
	 */
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	/**
	 * This gets the Player Location 
	 * @return the playerLocation
	 */
	public int getPlayerLocation() {
		return playerLocation;
	}

	/**
	 * This sets the Player Location 
	 * @param playerLocation the playerLocation to set
	 */
	public void setPlayerLocation(int playerLocation) {
		this.playerLocation = playerLocation;
	}

	/**
	 * This gets the Agency Name 
	 * @return the company
	 */
	public AgencyName getAgency() {
		return agencyName;
	}

	/**
	 * This sets the Agency Name 
	 * @param company the company to set
	 */
	public void setCompany(AgencyName agencyName) {
		this.agencyName = agencyName;
	}

	/**
	 * This gets the Number of Developments
	 * @return
	 */
	public int getNumberDevelopments() {
		return numberDevelopments;
	}

	/**
	 * This sets the Number of Developments
	 * @param numberDevelopments
	 */
	public void setNumberDevelopments(int numberDevelopments) {
		this.numberDevelopments = numberDevelopments;
	}

	/**
	 * This method Sets Up the Player Names
	 * The number of players must be between 2- 4.
	 * The minimum and maximum numbers of players are stored as constants.
	 * @param players
	 * @param boards
	 * @param systems
	 */
	public static void setUpPlayerNames(ArrayList<Players> players, ArrayList<Board> boards, ArrayList<Systems> systems) {

		int nextPlayer;
		int numberOfPlayers = 0;
		String playerName;
		boolean checkPlayer = false;
		boolean playerNameCheck = false;
		List<String> names = new ArrayList<String>();

		nextPlayer = 1;
		
		do {
			try {

				System.out.println("Please enter the number of Players");
				numberOfPlayers = Integer.parseInt(PlayerInput.input());
				checkPlayer = true;
			} catch (NumberFormatException ex) {
				System.out.println(
						"Houston we have a problem! - Invalid choice, the number of Players must be between 2 and "+MAX_PLAYER_NUMBER+".");
				checkPlayer = false;
			}
		} while (!checkPlayer);

		while (numberOfPlayers < MIN_PLAYER_NUMBER || numberOfPlayers > MAX_PLAYER_NUMBER) {
			System.out.println("Houston we have a problem! - Sorry, the number of Players must be between 2 and "+MAX_PLAYER_NUMBER+".");
			System.out.println("Please re-enter the number of Players.");
			numberOfPlayers = Integer.parseInt(PlayerInput.input());
		}
		boards.get(0).setNumberOfPlayers(numberOfPlayers);


		for (int loop = 1; loop <= numberOfPlayers; loop++) {
			do {
				System.out.println("Please enter Player " + loop + " name");
				playerName = PlayerInput.input();
				
				
				
				if (names.contains(playerName)) {
					System.out.println("Sorry that name is already used by another Player, please enter an alternative name.");
					playerNameCheck = false;
				} else {
					names.add(playerName);
					playerNameCheck = true;

					players.get(nextPlayer - 1).setPlayerName(playerName);
					System.out.println("Welcome '" + playerName + "', you are the CEO of "
							+ players.get(nextPlayer - 1).getAgency() + "\n");
					nextPlayer++;
				}
			} while (!playerNameCheck);
		}
	}// end of set up players method
}
