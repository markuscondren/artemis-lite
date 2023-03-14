/**
 * 
 */
package artgame;

import java.util.Random;

/**
 * This is the Dice Class.
 * @author Group 12
 *
 */
public class Dice {

	private int diceOne;
	private int diceTwo;

	/**
	 * Default constructor
	 */
	public Dice() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with arguments passed in.
	 * 
	 * @param diceOne
	 * @param diceTwo
	 */
	public Dice(int diceOne, int diceTwo) {
		this.diceOne = diceOne;
		this.diceTwo = diceTwo;
	}

	/**
	 * This gets the value of Dice One.
	 * 
	 * @return the diceOne
	 */
	public int getDiceOne() {
		return diceOne;
	}

	/**
	 * This sets the value of Dice One.
	 * 
	 * @param diceOne the diceOne to set
	 */
	public void setDiceOne(int diceOne) {
		this.diceOne = diceOne;
	}

	/**
	 * This gets the value of Dice Two.
	 * 
	 * @return the diceTwo
	 */
	public int getDiceTwo() {
		return diceTwo;
	}

	/**
	 * This sets the value of Dice Two.
	 * 
	 * @param diceTwo the diceTwo to set
	 */
	public void setDiceTwo(int diceTwo) {
		this.diceTwo = diceTwo;
	}

	/**
	 * This method generates a random number between 1-6 for each of the two die and
	 * returns the sum of the two values.
	 * The method also prints a representation of the dice values to the screen.
	 * 
	 * @return - returns the sum of the two dice numbers.
	 */
	public int rollDice() {

		int diceOne;
		int diceTwo;

		Random random = new Random();
		int diceTotal;
		diceOne = random.nextInt(6);
		diceOne++;

		diceTwo = random.nextInt(6);
		diceTwo++;

		if (diceOne == 6) {
			six();
		} else if (diceOne == 5) {
			five();
		} else if (diceOne == 4) {
			four();
		} else if (diceOne == 3) {
			three();
		} else if (diceOne == 2) {
			two();
		} else {
			one();
		}

		if (diceTwo == 6) {
			six();
		} else if (diceTwo == 5) {
			five();
		} else if (diceTwo == 4) {
			four();
		} else if (diceTwo == 3) {
			three();
		} else if (diceTwo == 2) {
			two();
		} else {
			one();
		}

		diceTotal = diceOne + diceTwo;
		System.out.println("\nDICE TOTAL "+ diceTotal+"\n");

		return diceTotal;
	}

	/**
	 * This method prints a representation of a dice number 1 to screen.
	 */
	private static void one() {
		System.out.println("+-------+");
		System.out.println("|       |");
		System.out.println("|   *   |");
		System.out.println("|       |");
		System.out.println("+-------+");
	}

	/**
	 * This method prints a representation of a dice number 2 to screen.
	 */
	private static void two() {
		System.out.println("+-------+");
		System.out.println("| *     |");
		System.out.println("|       |");
		System.out.println("|     * |");
		System.out.println("+-------+");
	}

	/**
	 * This method prints a representation of a dice number 3 to screen.
	 */
	private static void three() {
		System.out.println("+-------+");
		System.out.println("| *     |");
		System.out.println("|   *   |");
		System.out.println("|     * |");
		System.out.println("+-------+");
	}

	/**
	 * This method prints a representation of a dice number 4 to screen.
	 */
	private static void four() {
		System.out.println("+-------+");
		System.out.println("| *   * |");
		System.out.println("|       |");
		System.out.println("| *   * |");
		System.out.println("+-------+");
	}

	/**
	 * This method prints a representation of a dice number 5 to screen.
	 */
	private static void five() {
		System.out.println("+-------+");
		System.out.println("| *   * |");
		System.out.println("|   *   |");
		System.out.println("| *   * |");
		System.out.println("+-------+");
	}

	/**
	 * This method prints a representation of a dice number 6 to screen.
	 */
	private static void six() {
		System.out.println("+-------+");
		System.out.println("| *   * |");
		System.out.println("| *   * |");
		System.out.println("| *   * |");
		System.out.println("+-------+");
	}


}
