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

class TestSystems {
	boolean fullyBought, fullyDeveloped;
	SystemName systemName;
	int systemNumber, numberDeveloped, ownerNumber, inTurn;

	ArrayList<Systems> systems;
	Systems system0;
	Systems system1;
	Systems system2;
	Systems system3;
	Systems system4;

	Players player1;
	Players player2;
	Players player3;
	Players player4;
	ArrayList<Players> players;

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
	
	Element element22;
	Element element23;
	ArrayList<Element> elements2;	
	
	Board board;
	ArrayList<Board> boards;

	@BeforeEach
	void setUp() throws Exception {
		fullyBought = false;
		fullyDeveloped = false;
		systemName = SystemName.ARTEMIS_BASECAMP;
		systemNumber = 4;
		numberDeveloped = 0;
		ownerNumber = 0;
		inTurn = 1;
		
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

		player1 = new Players("void", 1000, 1, 1, AgencyName.NASA, 0);
		player2 = new Players("void", 1000, 2, 1, AgencyName.CSA, 0);
		player3 = new Players("void", 1000, 3, 1, AgencyName.JAXA, 0);
		player4 = new Players("void", 1000, 4, 1, AgencyName.ESA, 0);
		
		players = new ArrayList<Players>();
		
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);

		element1 = new Element(1, ElementName.KENNEDY_SPACE_CENTRE, 0, true, 0, 0, 0, false, 0, 0);
		element2 = new Element(2, ElementName.RS25_LIQUID_ROCKET_ENGINES, 100, true, 1, 10, 0, false, 1, 50);
		element3 = new Element(3, ElementName.INTERIM_CRYOGENIC_PROPULSION_STAGE, 120, true, 1, 10, 0, false, 1, 60);
		element4 = new Element(4, ElementName.HEAT_SHIELD, 120, false, 0, 10, 0, false, 2, 60);
		element5 = new Element(5, ElementName.SERVICE_MODULE, 130, false, 0, 12, 0, false, 2, 65);
		element6 = new Element(6, ElementName.LAUNCH_ABORT_SYSTEM, 150, false, 0, 12, 0, false, 2, 75);
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
		
		elements2 = new ArrayList<Element>();
		
		element22 = new Element(2, ElementName.RS25_LIQUID_ROCKET_ENGINES, 100, false, 0, 10, 0, false, 1, 50);
		elements2.add(element1);
		elements2.add(element22);
		elements2.add(element3);
		elements2.add(element4);
		elements2.add(element5);
		elements2.add(element6);
		elements2.add(element7);
		elements2.add(element8);
		elements2.add(element9);
		elements2.add(element10);
		elements2.add(element11);
		elements2.add(element12);
		
		
		board = new Board(1, 0, false);
		boards = new ArrayList<Board>();
		
		boards.add(board);
	}

	@Test
	void UC01013testConstructorNoArgs() {
		Systems system = new Systems();
		assertNotNull(system);
	}

	@Test
	void UC01014testConstructorArgs() {
		Systems system = new Systems(systemNumber, fullyBought, fullyDeveloped, systemName, numberDeveloped,
				ownerNumber);
		assertNotNull(system);
		assertEquals(system.getSystemNumber(), systemNumber);
		assertEquals(system.isFullyBought(), fullyBought);
		assertEquals(system.isFullyDeveloped(), fullyDeveloped);
		assertEquals(system.getSystemName(), systemName);
		assertEquals(system.getNumberDeveloped(), numberDeveloped);
		assertEquals(system.getOwnerNumber(), ownerNumber);
	}

	@Test
	void UC02013testSystemNumberGetterSetters() {
		Systems system = new Systems();
		system.setSystemNumber(systemNumber);
		assertEquals(system.getSystemNumber(), systemNumber);
	}

	@Test
	void UC05014testFullyBoughtGetterSetters() {
		Systems system = new Systems();
		system.setFullyBought(fullyBought);
		assertEquals(system.isFullyBought(), fullyBought);
	}

	@Test
	void UC05015testFullyDevelopedGetterSetters() {
		Systems system = new Systems();
		system.setFullyDeveloped(fullyDeveloped);
		assertEquals(system.isFullyDeveloped(), fullyDeveloped);
	}

	@Test
	void UC02014testSystemNameGetterSetters() {
		Systems system = new Systems();
		system.setSystemName(systemName);
		assertEquals(system.getSystemName(), systemName);
	}

	@Test
	void UC05016testNumberDevelopedGetterSetters() {
		Systems system = new Systems();
		system.setNumberDeveloped(numberDeveloped);
		assertEquals(system.getNumberDeveloped(), numberDeveloped);
	}

	@Test
	void UC02010testOwnerNumberGetterSetters() {
		Systems system = new Systems();
		system.setOwnerNumber(ownerNumber);
		assertEquals(system.getOwnerNumber(), ownerNumber);
	}

	@Test
	void UC05017testCheckFullyBoughtTrue() {
		Systems.checkFullyBought(elements, players, inTurn, boards, systems);
		assertEquals(systems.get(1).getOwnerNumber(), elements.get(2).getOwnerNumber());
		assertEquals(systems.get(1).isFullyBought(), true);
	}
	
	@Test
	void UC05018testCheckFullyBoughtFalse() {
		Systems.checkFullyBought(elements2, players, inTurn, boards, systems);
		assertEquals(systems.get(1).isFullyBought(), false);
	}
	
	@Test
	void UC01004testCreateSystem() {
		ArrayList<Systems> systems = new ArrayList<Systems>();
		systems = Systems.createSystems();
		assertEquals(systems.get(0).getSystemNumber(), 0);
		assertEquals(systems.get(1).getSystemNumber(), 1);
		assertEquals(systems.get(2).getSystemNumber(), 2);
		assertEquals(systems.get(3).getSystemNumber(), 3);
		assertEquals(systems.get(4).getSystemNumber(), 4);
		assertEquals(systems.get(0).isFullyBought(), false);
		assertEquals(systems.get(1).isFullyBought(), false);
		assertEquals(systems.get(2).isFullyBought(), false);
		assertEquals(systems.get(3).isFullyBought(), false);
		assertEquals(systems.get(4).isFullyBought(), false);
		assertEquals(systems.get(0).isFullyDeveloped(), false);
		assertEquals(systems.get(1).isFullyDeveloped(), false);
		assertEquals(systems.get(2).isFullyDeveloped(), false);
		assertEquals(systems.get(3).isFullyDeveloped(), false);
		assertEquals(systems.get(4).isFullyDeveloped(), false);
		assertEquals(systems.get(0).getSystemName(), SystemName.FREE_SQUARE);
		assertEquals(systems.get(1).getSystemName(), SystemName.SPACE_LAUNCH_SYSTEM);
		assertEquals(systems.get(2).getSystemName(), SystemName.ORION_SPACECRAFT);
		assertEquals(systems.get(3).getSystemName(), SystemName.THE_GATEWAY);
		assertEquals(systems.get(4).getSystemName(), SystemName.ARTEMIS_BASECAMP);
		assertEquals(systems.get(0).getNumberDeveloped(), 0);
		assertEquals(systems.get(1).getNumberDeveloped(), 0);
		assertEquals(systems.get(2).getNumberDeveloped(), 0);
		assertEquals(systems.get(3).getNumberDeveloped(), 0);
		assertEquals(systems.get(4).getNumberDeveloped(), 0);
		assertEquals(systems.get(0).getOwnerNumber(), 0);
		assertEquals(systems.get(1).getOwnerNumber(), 0);
		assertEquals(systems.get(2).getOwnerNumber(), 0);
		assertEquals(systems.get(3).getOwnerNumber(), 0);
		assertEquals(systems.get(4).getOwnerNumber(), 0);
	}
}
