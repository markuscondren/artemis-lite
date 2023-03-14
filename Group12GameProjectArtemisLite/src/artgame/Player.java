/**
 * 
 */
package artgame;

/**
 * This is the PLayer Class
 * @author Group 12
 *
 */
public class Player {
	
	private String playerName;
	private int playerBalance;

	/**
	 * default constructor
	 */
	public Player() {
		
	}
	
	/**
	 * Constructor with parameter arguments
	 * @param playerName
	 * @param playerBalance
	 */
	public Player(String playerName, int playerBalance) {
		this.playerName = playerName;
		this.playerBalance = playerBalance;
	}

	/**
	 * This gets the Players name 
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * This sets the Players name 
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * This gets the Players balance 
	 * @return the playerBalance
	 */
	public int getPlayerBalance() {
		return playerBalance;
	}

	/**
	 * This sets the Players balance 
	 * @param playerBalance the playerBalance to set
	 */
	public void setPlayerBalance(int playerBalance) {
		this.playerBalance = playerBalance;
	}


}
