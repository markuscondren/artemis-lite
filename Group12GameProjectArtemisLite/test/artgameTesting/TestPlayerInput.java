package artgameTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import artgame.PlayerInput;
class TestPlayerInput {
	String input;
	@BeforeEach
	void setUp() throws Exception {
	}
	
	//testing whether input will return correctly into input string as it should in the game, set input of "a" (no prompt for entry)
	@Test
	void UC01017testInput() {
		System.out.println("Done assuming player simply enters 'a' as an input.");
		input = PlayerInput.input();
		assertEquals(input, "a");
	}

}
