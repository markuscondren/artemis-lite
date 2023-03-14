package artgameTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import artgame.AgencyName;
import artgame.Board;
import artgame.Element;
import artgame.ElementName;
import artgame.Player;
import artgame.Players;
import artgame.SystemName;
import artgame.Systems;

class TestBoard {
	int playerTurn, numberOfPlayers;
	boolean gameWon;
	Players Player1;
	Players Player2;
	Players Player3;
	Players Player4;
	ArrayList<Players> players;

	Players Player21;
	Players Player22;
	Players Player23;
	Players Player24;
	ArrayList<Players> players2;

	Players Player31;
	Players Player32;
	Players Player33;
	Players Player34;
	ArrayList<Players> players3;

	Element element1;
	Element element2;
	Element element3;
	Element element4;
	Element element5;
	Element element6;
	Element element7;
	Element element8;
	Element element9;
	Element element10;
	Element element11;
	Element element12;
	ArrayList<Element> elements;

	Systems system0;
	Systems system1;
	Systems system2;
	Systems system3;
	Systems system4;
	ArrayList<Systems> systems;

	Board board;
	ArrayList<Board> boards;

	int plTurn;

	@BeforeEach
	void setUp() throws Exception {
		playerTurn = 1;
		numberOfPlayers = 4;
		gameWon = false;

		Player1 = new Players("Player 1", 1000, 1, 4, AgencyName.NASA, 0);
		Player2 = new Players("Player 2", 1000, 2, 1, AgencyName.CSA, 0);
		Player3 = new Players("Player 3", 1000, 3, 1, AgencyName.JAXA, 0);
		Player4 = new Players("Player 4", 1000, 4, 1, AgencyName.ESA, 0);

		Player21 = new Players("Player 1", 1000, 1, 1, AgencyName.NASA, 0);
		Player22 = new Players("Player 2", 1000, 2, 1, AgencyName.CSA, 0);
		Player23 = new Players("Player 3", 1000, 3, 1, AgencyName.JAXA, 0);
		Player24 = new Players("Player 4", 1000, 4, 1, AgencyName.ESA, 0);

		Player31 = new Players("Player 1", 1000, 1, 8, AgencyName.NASA, 0);
		Player32 = new Players("Player 2", 1000, 2, 1, AgencyName.CSA, 0);
		Player33 = new Players("Player 3", 1000, 3, 1, AgencyName.JAXA, 0);
		Player34 = new Players("Player 4", 1000, 4, 1, AgencyName.ESA, 0);

		players = new ArrayList<Players>();
		players.add(Player1);
		players.add(Player2);
		players.add(Player3);
		players.add(Player4);

		players2 = new ArrayList<Players>();
		players2.add(Player21);
		players2.add(Player22);
		players2.add(Player23);
		players2.add(Player24);

		players3 = new ArrayList<Players>();
		players3.add(Player31);
		players3.add(Player32);
		players3.add(Player33);
		players3.add(Player34);

		element1 = new Element(1, ElementName.KENNEDY_SPACE_CENTRE, 0, true, 0, 0, 0, false, 0, 0);
		element2 = new Element(2, ElementName.RS25_LIQUID_ROCKET_ENGINES, 100, true, 1, 10, 0, false, 1, 50);
		element3 = new Element(3, ElementName.INTERIM_CRYOGENIC_PROPULSION_STAGE, 120, true, 1, 10, 0, false, 1, 60);
		element4 = new Element(4, ElementName.HEAT_SHIELD, 120, true, 2, 10, 0, false, 2, 60);
		element5 = new Element(5, ElementName.SERVICE_MODULE, 130, true, 2, 12, 0, false, 2, 65);
		element6 = new Element(6, ElementName.LAUNCH_ABORT_SYSTEM, 150, true, 2, 12, 0, false, 2, 75);
		element7 = new Element(7, ElementName.ANNUAL_LEAVE, 0, true, 0, 0, 0, false, 0, 0);
		element8 = new Element(8, ElementName.POWER_AND_PROPULSION_ELEMENT, 150, false, 0, 14, 0, false, 3, 75);
		element9 = new Element(9, ElementName.HABITATION_AND_LOGISTICS_OUTPOST, 160, false, 0, 14, 0, false, 3, 80);
		element10 = new Element(10, ElementName.PAYLOAD_AND_RESEARCH_INVESTIGATION, 170, false, 0, 14, 0, false, 3, 85);
		element11 = new Element(11, ElementName.LUNAR_TERRAIN_VEHICLE, 180, false, 0, 16, 0, false, 4, 90);
		element12 = new Element(12, ElementName.POLAR_EXPLORATION_ROVER, 200, false, 0, 16, 0, false, 4, 100);

		elements = new ArrayList<Element>();
		elements.add(element1);
		elements.add(element2);
		elements.add(element3);
		elements.add(element4);
		elements.add(element5);
		elements.add(element6);
		elements.add(element7);
		elements.add(element8);
		elements.add(element9);
		elements.add(element10);
		elements.add(element11);
		elements.add(element12);

		system0 = new Systems(0, false, false, SystemName.FREE_SQUARE, 0, 0);
		system1 = new Systems(1, false, false, SystemName.SPACE_LAUNCH_SYSTEM, 0, 0);
		system2 = new Systems(2, false, false, SystemName.ORION_SPACECRAFT, 0, 0);
		system3 = new Systems(3, false, false, SystemName.THE_GATEWAY, 0, 0);
		system4 = new Systems(4, false, false, SystemName.ARTEMIS_BASECAMP, 0, 0);
		systems = new ArrayList<Systems>();
		systems.add(system0);
		systems.add(system1);
		systems.add(system2);
		systems.add(system3);
		systems.add(system4);

		board = new Board(1, 0, false);
		boards = new ArrayList<Board>();
		boards.add(board);
		plTurn = 1;

	}

	@Test
	void UC01005testConstructorNoArgs() {
		Board board = new Board();
		assertNotNull(board);
	}

	@Test
	void UC01006testConstructorArgs() {
		Board board = new Board(playerTurn, numberOfPlayers, gameWon);
		assertNotNull(board);
		assertEquals(board.getPlayerTurn(), playerTurn);
		assertEquals(board.getNumberOfPlayers(), numberOfPlayers);
		assertEquals(board.isGameWon(), gameWon);
	}

	@Test
	void UC02001testPlayerTurnGetterSetter() {
		Board board = new Board();
		board.setPlayerTurn(playerTurn);
		assertEquals(board.getPlayerTurn(), playerTurn);
	}

	@Test
	void UC01015testNumberOfPlayersGetterSetter() {
		Board board = new Board();
		board.setNumberOfPlayers(numberOfPlayers);
		assertEquals(board.getNumberOfPlayers(), numberOfPlayers);
	}

	@Test
	void UC05019testGameWonGetterSetter() {
		Board board = new Board();
		board.setGameWon(gameWon);
		assertEquals(board.isGameWon(), gameWon);
	}

	// checks when the element the player is on is owned by another player, second
	// prompt in output, assumes player presses 1
	@Test
	void UC06002testCheckElementPayRent() {
		System.out.println("done assuming player presses 1 to take rent");
		int originalBalance1, originalBalance2;
		originalBalance1 = players.get(plTurn - 1).getPlayerBalance();
		originalBalance2 = players.get(elements.get(players.get(plTurn - 1).getPlayerLocation()).getOwnerNumber() - 1)
				.getPlayerBalance();

		board.checkElement(elements, players, plTurn, players.get(plTurn - 1).getPlayerLocation());
		assertEquals(players.get(plTurn - 1).getPlayerBalance(),
				originalBalance1 - elements.get(players.get(plTurn - 1).getPlayerLocation() - 1).getElementRent());
		assertEquals(
				players.get(elements.get(players.get(plTurn - 1).getPlayerLocation()).getOwnerNumber() - 1)
						.getPlayerBalance(),
				originalBalance2 + elements.get(players.get(plTurn - 1).getPlayerLocation() - 1).getElementRent());
	}

	// checks when the element the player is on is owned by another player, first
	// prompt in output, assumes player presses 2
	@Test
	void UC06003testCheckElementDontPayRent() {
		System.out.println("done assuming player presses 2 to not take rent");
		int originalBalance1, originalBalance2;
		originalBalance1 = players.get(plTurn - 1).getPlayerBalance();
		originalBalance2 = players.get(elements.get(players.get(plTurn - 1).getPlayerLocation()).getOwnerNumber() - 1)
				.getPlayerBalance();
		board.checkElement(elements, players, plTurn, players.get(plTurn - 1).getPlayerLocation());
		assertEquals(players.get(plTurn - 1).getPlayerBalance(), originalBalance1);
		assertEquals(players.get(elements.get(players.get(plTurn - 1).getPlayerLocation()).getOwnerNumber() - 1)
				.getPlayerBalance(), originalBalance2);
	}

	// checks when the element the player is on is a free element
	@Test
	void UC02011testCheckElementFreeSquare() {
		int originalBalance1;
		originalBalance1 = players2.get(plTurn - 1).getPlayerBalance();
		board.checkElement(elements, players2, plTurn, players2.get(plTurn - 1).getPlayerLocation());
		assertEquals(players2.get(plTurn - 1).getPlayerBalance(), originalBalance1);
	}

	// checks when the element the player is on is an element available to buy
	@Test
	void UC02012testCheckElementSquareToBuy() {
		int originalBalance1;
		originalBalance1 = players3.get(plTurn - 1).getPlayerBalance();
		board.checkElement(elements, players3, plTurn, players3.get(plTurn - 1).getPlayerLocation());
		assertEquals(players3.get(plTurn - 1).getPlayerBalance(), originalBalance1);
	}

	@Test
	void UC02001testMakeBoard() {
		ArrayList<Board> boards = new ArrayList<Board>();
		boards = Board.makeBoard();
		assertEquals(boards.get(0).getPlayerTurn(), 1);
		assertEquals(boards.get(0).getNumberOfPlayers(), 0);
		assertEquals(boards.get(0).isGameWon(), false);
	}
}
