package artgame;
import java.util.Scanner;

/**
 * This is the Player Input Class 
 * @author Group 12
 *
 */
public class PlayerInput {
	
	/**
	 * This method creates an instance of the Scanner
	 * @return - returns the player inputs from the console
	 */
    public static String input() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}