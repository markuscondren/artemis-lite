package artgameTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import artgame.AgencyName;
import artgame.Board;
import artgame.Element;
import artgame.ElementName;
import artgame.Players;
import artgame.SystemName;
import artgame.Systems;

class TestPlayers {
	int playerNumber, numberDevelopments, playerLocation, playerBalance;
	AgencyName agencyName;
	String playerName;
	Players player1;
	Players player2;
	Players player3;
	Players player4;
	ArrayList<Players> players;
	
	Board board;
	ArrayList<Board> boards;
	
	Systems system0; 
	Systems system1;
	Systems system2;
	Systems system3;
	Systems system4;
	ArrayList<Systems> systems;
	
	@BeforeEach
	void setUp() throws Exception {
		playerNumber = 1;
		playerLocation = 1;
		agencyName = AgencyName.NASA;
		numberDevelopments = 0;
		playerBalance = 1000;
		playerName = "Name";
		
		player1 = new Players("void", 1000, 1, 1, AgencyName.NASA, 0);
		player2 = new Players("void", 1000, 2, 1, AgencyName.CSA, 0);
		player3 = new Players("void", 1000, 3, 1, AgencyName.JAXA, 0);
		player4 = new Players("void", 1000, 4, 1, AgencyName.ESA, 0);
		players = new ArrayList<Players>();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		
		board = new Board(1, 0, false);
		boards = new ArrayList<Board>();
		boards.add(board);
		
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
	}

	@Test
	void UC01011testConstructorNoArgs() {
		Players player = new Players();
		assertNotNull(player);
	}
	
	@Test
	void UC01012testConstructorArgs() {
		Players player = new Players(playerName, playerBalance, playerNumber, playerLocation, agencyName, numberDevelopments);
		assertNotNull(player);
		assertEquals(player.getPlayerName(), playerName);
		assertEquals(player.getPlayerBalance(), playerBalance);
		assertEquals(player.getPlayerNumber(), playerNumber);
		assertEquals(player.getPlayerLocation(), playerLocation);
		assertEquals(player.getAgency(), agencyName);
		assertEquals(player.getNumberDevelopments(), numberDevelopments);
	}
	
	@Test
	void UC01018testPlayerNameGetterSetter() {
		Players player = new Players();
		player.setPlayerName(playerName);
		assertEquals(player.getPlayerName(), playerName);
	}
	
	@Test
	void UC04002testPlayerBalanceGetterSetter() {
		Players player = new Players();
		player.setPlayerBalance(playerBalance);
		assertEquals(player.getPlayerBalance(), playerBalance);
	}
	
	@Test
	void UC02008testPlayerNumberGetterSetter() {
		Players player = new Players();
		player.setPlayerNumber(playerNumber);
		assertEquals(player.getPlayerNumber(), playerNumber);
	}
	
	@Test
	void UC02009testPlayerLocationGetterSetter() {
		Players player = new Players();
		player.setPlayerLocation(playerLocation);
		assertEquals(player.getPlayerLocation(), playerLocation);
	}
	
	@Test
	void UC01019testPlayerAgencyGetterSetter() {
		Players player = new Players();
		player.setCompany(agencyName);
		assertEquals(player.getAgency(), agencyName);
	}
	
	@Test
	void UC05013testNumberDevelopmentsGetterSetter() {
		Players player = new Players();
		player.setNumberDevelopments(numberDevelopments);
		assertEquals(player.getNumberDevelopments(), numberDevelopments);
	}
	
	@Test
	void UC01020testSetUpPlayerNames() {
		System.out.println("Done assuming 4 players are selected and names entered as 'a', 'b', 'c', and 'd.'");
		Players.setUpPlayerNames(players, boards, systems);
		assertEquals(players.get(0).getPlayerName(), "a");
		assertEquals(players.get(1).getPlayerName(), "b");
		assertEquals(players.get(2).getPlayerName(), "c");
		assertEquals(players.get(3).getPlayerName(), "d");
	}
	
	@Test
	void UC01003testPlayerCreation() {
		ArrayList<Players> players = new ArrayList<Players>();
		players = Players.playerCreation();
		assertEquals(players.get(0).getPlayerName(), "void");
		assertEquals(players.get(1).getPlayerName(), "void");
		assertEquals(players.get(2).getPlayerName(), "void");
		assertEquals(players.get(3).getPlayerName(), "void");
		assertEquals(players.get(0).getPlayerBalance(), 1000);
		assertEquals(players.get(1).getPlayerBalance(), 1000);
		assertEquals(players.get(2).getPlayerBalance(), 1000);
		assertEquals(players.get(3).getPlayerBalance(), 1000);
		assertEquals(players.get(0).getPlayerNumber(), 1);
		assertEquals(players.get(1).getPlayerNumber(), 2);
		assertEquals(players.get(2).getPlayerNumber(), 3);
		assertEquals(players.get(3).getPlayerNumber(), 4);
		assertEquals(players.get(0).getPlayerLocation(), 1);
		assertEquals(players.get(1).getPlayerLocation(), 1);
		assertEquals(players.get(2).getPlayerLocation(), 1);
		assertEquals(players.get(3).getPlayerLocation(), 1);
		assertEquals(players.get(0).getAgency(), AgencyName.NASA);
		assertEquals(players.get(1).getAgency(), AgencyName.CSA);
		assertEquals(players.get(2).getAgency(), AgencyName.JAXA);
		assertEquals(players.get(3).getAgency(), AgencyName.ESA);
		assertEquals(players.get(0).getNumberDevelopments(), 0);
		assertEquals(players.get(1).getNumberDevelopments(), 0);
		assertEquals(players.get(2).getNumberDevelopments(), 0);
		assertEquals(players.get(3).getNumberDevelopments(), 0);
	}
}
